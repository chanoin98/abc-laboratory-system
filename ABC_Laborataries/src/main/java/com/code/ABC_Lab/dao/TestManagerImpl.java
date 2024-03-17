package com.code.ABC_Lab.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.code.ABC_Lab.dao.dbutils.DbDriverManager;
import com.code.ABC_Lab.dao.dbutils.DbDriverManagerFactory;
import com.code.ABC_Lab.model.Test;


public class TestManagerImpl implements TestManager{


	public TestManagerImpl() {
		
	}
	
	private Connection getConnection() throws ClassNotFoundException, SQLException
	{
		DbDriverManagerFactory driverFactory = new DbDriverManagerFactory();
		DbDriverManager driverManager = driverFactory.getDbDriver("MySQL");


		return driverManager.getConnection();
	}
	
	public boolean insertNewTest(Test test) throws SQLException, ClassNotFoundException {
		
		Connection connection = getConnection();
		
		String query = "INSERT INTO test (testName,testPrize,testTimeslot)VALUES (?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1,  test.getTestName());
		ps.setDouble(2, test.getTestPrize());
		ps.setString(3,  test.getTestTimeslot());

		
		boolean result = false;
		
		if(ps.executeUpdate()>0)
			result = true;
		ps.close();
		connection.close();
		return result;
	}

	public Test getSpecificTest(int testCode) throws SQLException, ClassNotFoundException {
		
		Connection connection = getConnection();
		String query = "SELECT * FROM test WHERE testCode=?";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, testCode);
		
		ResultSet rs =ps.executeQuery();
		
		Test test = new Test();
		
		while(rs.next())
		{
			test.setTestCode(rs.getInt("testCode"));
			test.setTestName(rs.getString("testName"));
			test.setTestPrize(rs.getDouble("testPrize"));
			test.setTestTimeslot(rs.getString("testTimeslot"));
			
			//System.out.println(rs.getString("testName"));
			
		}
	
		ps.close();
		connection.close();
		return test;
	}

	
	public List<Test> getAllTests() throws SQLException, ClassNotFoundException {
		Connection connection = getConnection();
		String query = "SELECT * FROM test";
		Statement st = connection.createStatement();
		List<Test> testList= new ArrayList<Test>();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			Test test =  new Test();
			test.setTestCode(rs.getInt("testCode"));
			test.setTestName(rs.getString("testName"));
			test.setTestPrize(rs.getDouble("testPrize"));
			test.setTestTimeslot(rs.getString("testTimeslot"));

			
			testList .add(test);
		//	System.out.println(rs.getString("testName"));

			
		}

		st.close();
		
		connection.close();
		return testList;
	}

	public boolean editTheTest(Test test) throws SQLException, ClassNotFoundException {
		
		Connection connection = getConnection();
		String query = "UPDATE test SET testName=?,testPrize=? ,testTimeslot=? WHERE testCode=? ";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, test.getTestName());
		ps.setDouble(2, test.getTestPrize());
		ps.setString(3, test.getTestTimeslot());
		ps.setInt(4, test.getTestCode());

	
		boolean result = false;
		if(ps.executeUpdate()>0)
			result=true;
		ps.close();
		connection.close();
		return result;
	}


	public boolean deleteTheTest(int testCode) throws SQLException, ClassNotFoundException {
		Connection connection = getConnection();
		String query= "DELETE FROM test WHERE testCode=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, testCode);
		boolean result = false;
		if(ps.executeUpdate()>0)
			result=true;
		
		ps.close();
		connection.close();
		
		return result;
	}

	public String insertNewTest(HashMap<String, String> test) {
		// TODO Auto-generated method stub
		return null;
	}

}
