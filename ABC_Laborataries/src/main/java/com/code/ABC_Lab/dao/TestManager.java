package com.code.ABC_Lab.dao;

import java.sql.SQLException;
import java.util.List;

import com.code.ABC_Lab.model.Test;


public interface TestManager {


	public boolean insertNewTest(Test test)throws SQLException, ClassNotFoundException;
	public Test getSpecificTest(int testCode)throws SQLException, ClassNotFoundException;
	public List<Test> getAllTests() throws SQLException, ClassNotFoundException;
	public boolean editTheTest(Test test)throws SQLException, ClassNotFoundException;
	public boolean deleteTheTest(int testtCode)throws SQLException, ClassNotFoundException;

	

	
}


