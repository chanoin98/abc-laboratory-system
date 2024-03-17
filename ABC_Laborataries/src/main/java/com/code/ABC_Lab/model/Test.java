package com.code.ABC_Lab.model;

public class Test {
	private int testCode;
	private String testName;
	private double testPrize ;
	private String testTimeslot;

	
	
	public Test(int testCode, String testName, double testPrize, String testTimeslot) {
		this.testCode = testCode;
		this.testName = testName;
		this.testPrize = testPrize;
		this.testTimeslot = testTimeslot;

	}
	
	public Test() {
	}

	public Test(String testName, double testPrize, String testTimeslot) {
		this.testName = testName;
		this.testPrize = testPrize;
		this.testTimeslot = testTimeslot;

	}

	public int getTestCode() {
		return testCode;
	}

	public void setTestCode(int testCode) {
		this.testCode = testCode;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public double getTestPrize() {
		return testPrize;
	}

	public void setTestPrize(double testPrize) {
		this.testPrize = testPrize;
	}
	public String getTestTimeslot() {
		return testTimeslot;
	}

	public void setTestTimeslot(String testTimeslot) {
		this.testTimeslot = testTimeslot;
	}
	
	

}
