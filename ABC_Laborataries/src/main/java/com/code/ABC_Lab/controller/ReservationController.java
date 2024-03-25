package com.code.ABC_Lab.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.code.ABC_Lab.model.Reservation;
import com.code.ABC_Lab.service.PatientService;
import com.code.ABC_Lab.service.ReservationService;
import com.code.ABC_Lab.service.TestService;

public class ReservationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String message="";

    
	
	private ReservationService getReservationService() {
		return ReservationService.getReservationService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String actiontype = request.getParameter("actiontype");
			
			if (actiontype.equals("add")){
				insertNewReservation(request,response);
			}
			else {
			}
	}
	

	private void insertNewReservation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		clearMessage();

		Reservation reservation = new Reservation();
		reservation.setPatientUHID(Integer.parseInt(request.getParameter("patientUHID")));
		reservation.setPatientName(request.getParameter("patientname"));
		reservation.setPatientNic(request.getParameter("patientNic"));
		reservation.setPatientAge(Integer.parseInt(request.getParameter("patientAge")));
		reservation.setPatientContactno(Integer.parseInt(request.getParameter("patientContactnumber")));
		reservation.setPatientEmail(request.getParameter("patientEmail"));
		reservation.setTestCode(Integer.parseInt(request.getParameter("testCode")));
		reservation.setTestName(request.getParameter("testName"));
		reservation.setDocName(request.getParameter("docName"));
		reservation.setTestTimeslot(request.getParameter("testTimeslot"));

		
		try {
			if (getReservationService().insertNewReservation(reservation))
			{
				message = "Your Reservation is Successfull ! Reservation number : "+ reservation.getReservationNumber();
			}
			else {
				message = "Failed to reserve !";
			}
			} catch (ClassNotFoundException | SQLException e) {
			message = "Operation failed " + e.getMessage();
			}
		
		request.setAttribute("feedbackMessage", message);
		RequestDispatcher rd = request.getRequestDispatcher("ReserveAppoinments.jsp");
		rd.forward(request,response);
		
		
	}
/*	
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


*/



public void clearMessage() {
message = "";
}

}
