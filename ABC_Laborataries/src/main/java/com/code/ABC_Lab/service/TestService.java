package com.code.ABC_Lab.service;

import java.sql.SQLException;
import java.util.List;

import com.code.ABC_Lab.dao.TestManager;
import com.code.ABC_Lab.dao.TestManagerImpl;
import com.code.ABC_Lab.model.Test;

public class TestService {
		
	private static TestService testServiceObj;
	
	private TestService() {
		
	}
	public synchronized static TestService getTestService()
	{
		if (testServiceObj == null) {
			testServiceObj = new TestService();
		}
		
		return testServiceObj;
	}
	
	private TestManager getTestManager()
	{
		return new TestManagerImpl();
	}
	
	public boolean insertNewTest(Test test) throws SQLException, ClassNotFoundException {
		return getTestManager().insertNewTest(test);
	}

	public Test getSpecificTest(int testCode) throws SQLException, ClassNotFoundException {
		return getTestManager().getSpecificTest(testCode);
	}

	public List<Test> getAllTests() throws ClassNotFoundException, SQLException {
		return getTestManager().getAllTests();
	}

	public boolean editTheTest(Test test) throws SQLException, ClassNotFoundException {
		return getTestManager().editTheTest(test);
	}
	
	
	public boolean deleteTheTest(int testCode) throws SQLException, ClassNotFoundException {
		return getTestManager().deleteTheTest(testCode);
	}


}
