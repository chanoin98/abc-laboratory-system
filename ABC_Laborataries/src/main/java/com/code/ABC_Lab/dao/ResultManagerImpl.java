package com.code.ABC_Lab.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.code.ABC_Lab.dao.dbutils.DbDriverManager;
import com.code.ABC_Lab.dao.dbutils.DbDriverManagerFactory;
import com.code.ABC_Lab.model.Result;


public class ResultManagerImpl implements ResultManager {
	
public ResultManagerImpl() {
		
	}
	
	private Connection getConnection() throws ClassNotFoundException, SQLException
	{
		DbDriverManagerFactory driverFactory = new DbDriverManagerFactory();
		DbDriverManager driverManager = driverFactory.getDbDriver("MySQL");


		return driverManager.getConnection();
	}
	
	public boolean insertNewResult(Result result) throws SQLException, ClassNotFoundException {
		
		Connection connection = getConnection();
		
		String query = "INSERT INTO result (patientName,testRefno,testCode,testName,testResult,testComment)VALUES (?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1,  result.getPatientName());
		ps.setInt(2,  result.getTestRefno());
		ps.setInt(3,  result.getTestCode());
		ps.setString(4,  result.getTestName());
		ps.setString(5,  result.getTestResult());
		ps.setString(6,  result.getTestComment());
		
		boolean result1 = false;
		
		if(ps.executeUpdate()>0)
			result1 = true;
		ps.close();
		connection.close();
		return result1;
	}

	public Result getSpecificResult(int testRefno) throws SQLException, ClassNotFoundException {
		
		Connection connection = getConnection();
		String query = "SELECT * FROM result WHERE testRefno=?";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, testRefno);
		
		ResultSet rs =ps.executeQuery();
		
		Result result2 = new Result();
		
		while(rs.next())
		{
			result2.setPatientName(rs.getString("patientName"));
			//result.setTestRefno(rs.getInt("testRefno"));
			result2.setTestCode(rs.getInt("testCode"));
			result2.setTestName(rs.getString("testName"));
			result2.setTestResult(rs.getString("testResult"));
			result2.setTestComment(rs.getString("testComment"));

			
		}
	
		ps.close();
		connection.close();
		return result2;
	
}}



