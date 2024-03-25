package com.code.ABC_Lab.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import com.code.ABC_Lab.dao.dbutils.DbDriverManager;
import com.code.ABC_Lab.dao.dbutils.DbDriverManagerFactory;
import com.code.ABC_Lab.model.LabResult;


public class ResultManagerImpl implements ResultManager {
	
public ResultManagerImpl() {
		
	}
	
	private Connection getConnection() throws ClassNotFoundException, SQLException
	{
		DbDriverManagerFactory driverFactory = new DbDriverManagerFactory();
		DbDriverManager driverManager = driverFactory.getDbDriver("MySQL");


		return driverManager.getConnection();
	}
	
	public boolean insertNewResult(LabResult labResult) throws SQLException, ClassNotFoundException {
		
		Connection connection = getConnection();
		
		String query = "INSERT INTO labResult (patientName,testRefno,testCode,testName,testResult,testComment)VALUES (?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1,  labResult.getPatientName());
		ps.setInt(2,  labResult.getTestRefno());
		ps.setInt(3,  labResult.getTestCode());
		ps.setString(4,  labResult.getTestName());
		ps.setString(5,  labResult.getTestResult());
		ps.setString(6,  labResult.getTestComment());
		
		boolean result = false;
		
		if(ps.executeUpdate()>0)
			result = true;
		ps.close();
		connection.close();
		return result;
	}

	public LabResult getSpecificResult(int testRefno) throws SQLException, ClassNotFoundException {
		
		Connection connection = getConnection();
		String query = "SELECT * FROM labResult WHERE testRefno=?";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, testRefno);
		
		ResultSet rs =ps.executeQuery();
		
		LabResult labResult = new LabResult();
		
		while(rs.next())
		{
			labResult.setTestRefno(rs.getInt("testRefno"));
			labResult.setPatientName(rs.getString("patientName"));
			labResult.setTestCode(rs.getInt("testCode"));
			labResult.setTestName(rs.getString("testName"));
			labResult.setTestResult(rs.getString("testResult"));
			labResult.setTestComment(rs.getString("testComment"));

			
		}
	
		ps.close();
		connection.close();
		return labResult;
	
}

	public boolean insertNewResult(HashMap<String, String> result) {
		// TODO Auto-generated method stub
		return false;
	}

	
	}



