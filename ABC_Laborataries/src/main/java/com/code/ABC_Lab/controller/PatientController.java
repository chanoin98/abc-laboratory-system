package com.code.ABC_Lab.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.code.ABC_Lab.model.Patient;
import com.code.ABC_Lab.service.PatientService;

public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
String message="";
	
	private PatientService getPatientService() {
		return PatientService.getPatientService();
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actiontype= request.getParameter("actiontype");
		
		
		if(actiontype != null && actiontype.equals("single1")) {
			getSpecificPatient(request, response);
		}
		else {
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String actiontype = request.getParameter("actiontype");
		
		if (actiontype.equals("add")){
			insertNewPatient(request,response);
		}
		else {
		}
	}

	private void insertNewPatient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		clearMessage();

		Patient patient = new Patient();
		patient.setPatientName(request.getParameter("patientname"));
		patient.setPatientNic(request.getParameter("patientnic"));
		patient.setPatientAge(Integer.parseInt(request.getParameter("patientage")));
		patient.setPatientAddress(request.getParameter("patientaddress"));
		patient.setPatientContactno(Integer.parseInt(request.getParameter("patientcontactnumber")));
		patient.setPatientEmail(request.getParameter("patientemail"));
		patient.setPatientGender(request.getParameter("gender"));
		patient.setPatientUsername(request.getParameter("patientUsername"));
		patient.setPatientPassword(request.getParameter("patientPassword"));
		patient.setPatientConfirmPassword(request.getParameter("confirmpassword"));

		try {
			if (getPatientService().insertNewPatient(patient))
			{
				message = "Your Registration is Successfull ! Patient UHID: " + patient.getPatientUHID() ;
			}
			else {
				message = "Failed to register !";
			}
			} catch (ClassNotFoundException | SQLException e) {
			message = "Operation failed " + e.getMessage();
			}
		
		request.setAttribute("feedbackMessage", message);
		RequestDispatcher rd = request.getRequestDispatcher("insert-patient.jsp");
		rd.forward(request,response);
		
		
	}
	private void getSpecificPatient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		clearMessage();
		int patientUHID = Integer.parseInt(request.getParameter("patientUHID"));
		
		try {
			Patient patient = getPatientService().getSpecificPatient(patientUHID);
			if(patient.getPatientUHID()>0)
			{
				request.setAttribute("patient", patient);
			}else {
				message= "No record found under related search..";
			}
		} catch (ClassNotFoundException | SQLException e) {
			message=e.getMessage();
		}
		request.setAttribute("feedbackMessage", message);
		RequestDispatcher rd = request.getRequestDispatcher("ReserveAppoinments.jsp");
		rd.forward(request,response);
		
	}
	
public void clearMessage() {
	message = "";
}

}
