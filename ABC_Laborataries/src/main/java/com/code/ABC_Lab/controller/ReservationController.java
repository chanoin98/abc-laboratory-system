package com.code.ABC_Lab.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.code.ABC_Lab.model.Reservation;
import com.code.ABC_Lab.service.ReservationService;

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
		reservation.setPatientName(request.getParameter("patientname"));
		reservation.setPatientAge(Integer.parseInt(request.getParameter("patientage")));
		reservation.setPatientContactno(Integer.parseInt(request.getParameter("patientcontactnumber")));
		reservation.setPatientEmail(request.getParameter("patientemail"));
		reservation.setTestName(request.getParameter("testname"));
		reservation.setTestCode(Integer.parseInt(request.getParameter("testcode")));
		reservation.setRefDoc(request.getParameter("docname"));
		reservation.setTestTimeslot(request.getParameter("testtimeslot"));

		
		try {
			if (getReservationService().insertNewReservation(reservation))
			{
				message = "Your Reservation is Successfull ! ";
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
	
public void clearMessage() {
	message = "";
}

}
