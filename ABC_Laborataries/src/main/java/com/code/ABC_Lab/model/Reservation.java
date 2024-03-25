package com.code.ABC_Lab.model;

public class Reservation {
	private int reservationNumber;
	private int patientUHID;
	private String patientName;
	private String patientNic;
	private int patientAge;
	private int patientContactno;
	private String patientEmail;
	private String testName;
	private int testCode;
	private String docName;
	private String testTimeslot;

	public Reservation(int reservationNumber, int patientUHID,String patientName,String patientNic,int patientAge
			,int patientContactno,String patientEmail,String testName,int testCode,
			String docName,String testTimeslot) {
		this.reservationNumber = reservationNumber;
		this.patientUHID = patientUHID;
		this.patientName = patientName;
		this.patientNic = patientNic;
		this.patientAge = patientAge;
		this.patientContactno = patientContactno;
		this.patientEmail = patientEmail;
		this.testName = testName;
		this.testCode = testCode;
		this.docName = docName;
		this.testTimeslot = testTimeslot;

	}
	
	public Reservation() {
	}

	public Reservation(int patientUHID,String patientName, String patientNic,int patientAge,int patientContactno,String patientEmail,String testName,int testCode,
			String docName,String testTimeslot) {
		this.patientUHID = patientUHID;
		this.patientName = patientName;
		this.patientNic=patientNic;
		this.patientAge = patientAge;
		this.patientContactno = patientContactno;
		this.patientEmail = patientEmail;
		this.testName = testName;
		this.testCode = testCode;
		this.docName = docName;
		this.testTimeslot = testTimeslot;


	}

	public int getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(int reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	public int getPatientUHID() {
		return patientUHID;
	}

	public void setPatientUHID(int patientUHID) {
		this.patientUHID = patientUHID;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientNic() {
		return patientNic;
	}

	public void setPatientNic(String patientNic) {
		this.patientNic = patientNic;
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

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getTestTimeslot() {
		return testTimeslot;
	}

	public void setTestTimeslot(String testTimeslot) {
		this.testTimeslot = testTimeslot;
	}

	

}
