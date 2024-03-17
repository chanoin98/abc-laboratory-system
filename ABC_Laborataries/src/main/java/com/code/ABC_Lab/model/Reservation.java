package com.code.ABC_Lab.model;

public class Reservation {
	private int reservationNumber;
	private String patientName;
	private int patientAge;
	private int patientContactno;
	private String patientEmail;
	private String testName;
	private int testCode;
	private String refDoc;
	private String testTimeslot;

	public Reservation(int reservationNumber, String patientName,int patientAge
			,int patientContactno,String patientEmail,String testName,int testCode,
			String refDoc,String testTimeslot) {
		this.reservationNumber = reservationNumber;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientContactno = patientContactno;
		this.patientEmail = patientEmail;
		this.testName = testName;
		this.testCode = testCode;
		this.refDoc = refDoc;
		this.testTimeslot = testTimeslot;

	}
	
	public Reservation() {
	}

	public Reservation(String patientName, int patientAge,int patientContactno,String patientEmail,String testName,int testCode,
			String refDoc,String testTimeslot) {
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientContactno = patientContactno;
		this.patientEmail = patientEmail;
		this.testName = testName;
		this.testCode = testCode;
		this.refDoc = refDoc;
		this.testTimeslot = testTimeslot;


	}

	public int getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(int reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public int getPatientContactno() {
		return patientContactno;
	}

	public void setPatientContactno(int patientContactno) {
		this.patientContactno = patientContactno;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public int getTestCode() {
		return testCode;
	}

	public void setTestCode(int testCode) {
		this.testCode = testCode;
	}

	public String getRefDoc() {
		return refDoc;
	}

	public void setRefDoc(String refDoc) {
		this.refDoc = refDoc;
	}

	public String getTestTimeslot() {
		return testTimeslot;
	}

	public void setTestTimeslot(String testTimeslot) {
		this.testTimeslot = testTimeslot;
	}
	

}
