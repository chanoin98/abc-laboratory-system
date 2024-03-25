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

import com.code.ABC_Lab.dao.LoginDao;
import com.code.ABC_Lab.model.LoginBean;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
	String message="";

    private LoginDao loginDao;

    public void init() {
        loginDao = new LoginDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        LoginBean loginBean = new LoginBean();
        loginBean.setUsername(username);
        loginBean.setPassword(password);

        try {
            if (loginDao.validate(loginBean)) {
                
           response.sendRedirect("staffLoginsuccess.jsp");
           
            } else {

                response.sendRedirect("StaffLogin.jsp");

            
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
