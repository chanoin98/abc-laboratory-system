 package com.code.ABC_Lab.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.code.ABC_Lab.model.Test;
import com.code.ABC_Lab.service.TestService;

public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String message="";
	
	private TestService getTestService() {
		return TestService.getTestService();
		
	}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String actiontype= request.getParameter("actiontype");
		
		
		if(actiontype != null && actiontype.equals("single")) {
			getSpecificTest(request, response);
		}
		else {
			getAllTests(request, response);
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actiontype = request.getParameter("actiontype");
		
		if (actiontype.equals("add")){
			insertNewTest(request,response);
		}
		else if (actiontype.equals("edit")) {
			updatTheTest(request,response);
		}
		else if (actiontype.equals("delete")) {
			deleteTheTest(request,response);
		}
		
	}

	private void insertNewTest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		clearMessage();

		Test test = new Test();
		test.setTestName(request.getParameter("name"));
		test.setTestPrize(Double.parseDouble(request.getParameter("prize")));
		test.setTestTimeslot(request.getParameter("timeslot"));

		
		try {
			if (getTestService().insertNewTest(test))
			{
				message = "Adding new test is succefull ! ";
			}
			else {
				message = "Failed to add !";
			}
			} catch (ClassNotFoundException | SQLException e) {
			message = "Operation failed " + e.getMessage();
			}
		
		request.setAttribute("feedbackMessage", message);
		RequestDispatcher rd = request.getRequestDispatcher("insert-test.jsp");
		rd.forward(request,response);
		
		
	}
	private void updatTheTest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		clearMessage();
		Test test = new Test();
		test.setTestCode(Integer.parseInt(request.getParameter("testCode")));
		test.setTestName(request.getParameter("name"));
		test.setTestPrize(Double.parseDouble(request.getParameter("prize")));
		test.setTestTimeslot(request.getParameter("timeslot"));

		
		try {
			if(getTestService().updateTheTest(test)){
			message = "The test has been updated successfully.. Test Code : " + test.getTestCode();
			}else{
			message = "Failed to update the test Test Code : " + test.getTestCode();
			}
		} catch (ClassNotFoundException | SQLException e) {
			message=e.getMessage();
		}
		
		request.setAttribute("feedbackMessage", message);
		RequestDispatcher rd = request.getRequestDispatcher("search-and-update.jsp");
		rd.forward(request,response);
		
	}
	private void deleteTheTest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		clearMessage();
		int testCode = Integer.parseInt(request.getParameter("testCode"));
		try {
			if(getTestService().deleteTheTest(testCode)) {
				message = "Test has been deleted successfully ..Test Code : " +testCode;	
			}else {
				message = "Failed to delete the test..Test code : " + testCode;
			}
		} catch (ClassNotFoundException | SQLException e) {
			message = e.getMessage();
		}
		HttpSession session = request.getSession();
		session.setAttribute("message", message);
		response.sendRedirect("gettest?actiontype=all");
	
	}
	private void getSpecificTest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		clearMessage();
		int testCode = Integer.parseInt(request.getParameter("testCode"));
		
		try {
			Test test = getTestService().getSpecificTest(testCode);
			if(test.getTestCode()>0)
			{
				request.setAttribute("test", test);
			}else {
				message= "No record found under related search..";
			}
		} catch (ClassNotFoundException | SQLException e) {
			message=e.getMessage();
		}
		request.setAttribute("feedbackMessage", message);
		RequestDispatcher rd = request.getRequestDispatcher("search-and-update.jsp");
		rd.forward(request,response);
		
	}
	
	
private void getAllTests(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		clearMessage();
		
		List<Test> testList = new ArrayList<Test>();
		try {
			testList = getTestService().getAllTests();
			
			if(!(testList.size() > 0)) {
				message = "No record found!";
			}
		} 
		catch (ClassNotFoundException | SQLException e) {
			message = e.getMessage();
		}
		
		request.setAttribute("testList", testList);
		request.setAttribute("feebackMessage", message);
		
		RequestDispatcher rd = request.getRequestDispatcher("view-all-and-delete-specific.jsp");

		rd.forward(request, response);
		
	}
	


	public void clearMessage() {
		message = "";
	}
	
	
	


}
