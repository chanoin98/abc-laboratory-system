package com.code.ABC_Lab.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.code.ABC_Lab.model.Patient;
import com.code.ABC_Lab.model.Result;
import com.code.ABC_Lab.model.Test;
import com.code.ABC_Lab.service.PatientService;
import com.code.ABC_Lab.service.ResultService;


public class ResultController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String message="";
    
	private ResultService getResultService() {
		return ResultService.getResultService();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actiontype= request.getParameter("actiontype");
		
		
		if(actiontype != null && actiontype.equals("single")) {
			getSpecificResult(request, response);
		}
		else {
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String actiontype = request.getParameter("actiontype");
			
			if (actiontype.equals("add")){
				insertNewResult(request,response);
			}
			else {
			}
		}

		private void insertNewResult(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			clearMessage();

			Result result = new Result();
			result.setPatientName(request.getParameter("patientname"));
			result.setTestRefno(Integer.parseInt(request.getParameter("testRefno")));
			result.setTestCode(Integer.parseInt(request.getParameter("testCode")));
			result.setTestName(request.getParameter("testName"));
			result.setTestResult(request.getParameter("testResult"));
			result.setTestComment(request.getParameter("comment"));
			
			try {
				if (getResultService().insertNewResult(result))
				{
					message = "Test Result has entered Successfull ! ";
				}
				else {
					message = "Failed to enter !";
				}
				} catch (ClassNotFoundException | SQLException e) {
				message = "Operation failed " + e.getMessage();
				}
			
			request.setAttribute("feedbackMessage", message);
			RequestDispatcher rd = request.getRequestDispatcher("update-test-result.jsp");
			rd.forward(request,response);
			
			
		}
		private void getSpecificResult(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			int testRefno = Integer.parseInt(request.getParameter("testRefno"));

			
			
			try {
				Result result = getResultService().getSpecificResult(testRefno);
				if(result.getTestRefno()>0)
				{
					request.setAttribute("result", result);
					
				}else {
					message= "No record found under related search..";
				}
			} catch (ClassNotFoundException | SQLException e) {
				message=e.getMessage();
			}
			request.setAttribute("feedbackMessage", message);
			RequestDispatcher rd = request.getRequestDispatcher("Labreport.jsp");
			rd.forward(request,response);
			
		}
		
	
		
	public void clearMessage() {
		message = "";
	}

	}
