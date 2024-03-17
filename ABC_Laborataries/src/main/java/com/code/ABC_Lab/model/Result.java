package com.code.ABC_Lab.model;

public class Result {
	private int resultNo;
	private String patientName;
	private int testRefno;
	private int testCode;
	private String testName;
	private String testResult;
	private String testComment;
	

	public Result(int resultNo, String patientName, int testRefno, int testCode,String testName
			,String testResult,String testComment) {
		this.resultNo = resultNo;
		this.patientName = patientName;
		this.testRefno = testRefno;
		this.testCode = testCode;
		this.testName = testName;
		this.testResult = testResult;
		this.testComment = testComment;
	

	}
	
	public Result() {
	}

	public Result(String patientName, int testRefno, int testCode,String testName,
			String testResult,String testComment) {
		this.patientName = patientName;
		this.testRefno = testRefno;
		this.testCode = testCode;
		this.testName = testName;
		this.testResult = testResult;
		this.testComment = testComment;

	}

	public int getResultNo() {
		return resultNo;
	}

	public void setResultNo(int resultNo) {
		this.resultNo = resultNo;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getTestRefno() {
		return testRefno;
	}

	public void setTestRefno(int testRefno) {
		this.testRefno = testRefno;
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

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}

	public String getTestComment() {
		return testComment;
	}

	public void setTestComment(String testComment) {
		this.testComment = testComment;
	}
}