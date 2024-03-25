package com.code.ABC_Lab.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.code.ABC_Lab.dao.PatientLoginDao;
import com.code.ABC_Lab.model.PatientLoginBean;

@WebServlet("/ptlogin")
public class LoginServletPatient extends HttpServlet {
    private static final long serialVersionUID = 1L;
	String message="";

    private PatientLoginDao patientloginDao;

    public void init() {
    	patientloginDao = new PatientLoginDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String patientUsername = request.getParameter("patientUsername");
        String patientPassword = request.getParameter("patientPassword");
        PatientLoginBean patientloginBean = new PatientLoginBean();
        patientloginBean.setPatientUsername(patientUsername);
        patientloginBean.setPatientPassword(patientPassword);

        try {
            if (patientloginDao.validate(patientloginBean)) {
                
           response.sendRedirect("patientLoginsuccess.jsp");
           
            } else {

                response.sendRedirect("PatientLogin.jsp");

            
            }
        } catch (ClassNotFoundException e) {
        	message = "Operation failed " + e.getMessage();
        
        	e.printStackTrace();
        	

        }


    	HttpSession session = request.getSession();
        message = "Failed to login ! Invalid Username or Password...";

		session.setAttribute("feedbackmessage", message);

  
    }
}
