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

public class TestController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String message="";
	
	private TestService getTestService() {
		return TestService.getTestService();
		
	}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String actiontype1= request.getParameter("actiontype1");
		
		
		if(actiontype1 != null && actiontype1.equals("single")) {
			getAllTests(request, response);
		}

		
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
		
		RequestDispatcher rd = request.getRequestDispatcher("Viewall.jsp");

		rd.forward(request, response);
		
	}
	


	public void clearMessage() {
		message = "";
	}
	
	
	


}
