package com.code.ABC_Lab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.code.ABC_Lab.model.LoginBean;
import com.code.ABC_Lab.model.PatientLoginBean;


public class PatientLoginDao {

    public boolean validate(PatientLoginBean patientloginBean) throws ClassNotFoundException {
        boolean status = false;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/abc?useSSL=false", "root", "12345");

            PreparedStatement preparedStatement = connection
            .prepareStatement("select * from patient where patientUsername = ? and patientPassword = ? ")) {
            preparedStatement.setString(1, patientloginBean.getPatientUsername());
            preparedStatement.setString(2, patientloginBean.getPatientPassword());

            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();

        } catch (SQLException e) {
            printSQLException(e);
        }
        return status;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}