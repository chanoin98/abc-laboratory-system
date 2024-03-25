package com.code.ABC_Lab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import com.code.ABC_Lab.dao.dbutils.DbDriverManager;
import com.code.ABC_Lab.dao.dbutils.DbDriverManagerFactory;
import com.code.ABC_Lab.model.Patient;
import com.code.ABC_Lab.model.Test;


public class PatientManagerImpl implements PatientManager {
	
public PatientManagerImpl() {
		
	}
	
	private Connection getConnection() throws ClassNotFoundException, SQLException
	{
		DbDriverManagerFactory driverFactory = new DbDriverManagerFactory();
		DbDriverManager driverManager = driverFactory.getDbDriver("MySQL");


		return driverManager.getConnection();
	}
	
	public boolean insertNewPatient(Patient patient) throws SQLException, ClassNotFoundException {
		
		Connection connection = getConnection();
		
		String query = "INSERT INTO patient (patientName,patientNic,patientAge,patientAddress,patientContactno,patientEmail,patientGender,patientUsername,patientPassword,patientConfirmPassword)VALUES (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1,  patient.getPatientName());
		ps.setString(2, patient.getPatientNic());
		ps.setInt(3,  patient.getPatientAge());
		ps.setString(4,  patient.getPatientAddress());
		ps.setInt(5, patient.getPatientContactno());
		ps.setString(6,  patient.getPatientEmail());
		ps.setString(7,  patient.getPatientGender());
		ps.setString(8, patient.getPatientUsername());
		ps.setString(9,  patient.getPatientPassword());
		ps.setString(10,  patient.getPatientConfirmPassword());

		boolean result = false;
		
		if(ps.executeUpdate()>0)
			result = true;
		ps.close();
		connection.close();
		return result;
	}
public Patient getSpecificPatient(int patientUHID) throws SQLException, ClassNotFoundException {
		
		Connection connection = getConnection();
		String query = "SELECT * FROM patient WHERE patientUHID=?";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, patientUHID);
		
		ResultSet rs =ps.executeQuery();
		
		Patient patient = new Patient();
		
		while(rs.next())
		{
			patient.setPatientUHID(rs.getInt("patientUHID"));
			patient.setPatientName(rs.getString("patientName"));
			patient.setPatientNic(rs.getString("patientNic"));
			patient.setPatientAge(rs.getInt("patientAge"));
			patient.setPatientContactno(rs.getInt("patientContactno"));
			patient.setPatientName(rs.getString("patientName"));
			patient.setPatientEmail(rs.getString("patientEmail"));
			patient.setPatientGender(rs.getString("patientGender"));
		}
	
		ps.close();
		connection.close();
		return patient;
	}


	public String insertNewPatient(HashMap<String, String> patient) {
		// TODO Auto-generated method stub
		return null;
	}


}
