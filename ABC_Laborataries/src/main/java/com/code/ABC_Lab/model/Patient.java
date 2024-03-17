package com.code.ABC_Lab.model;

public class Patient {
	private int patientUHID;
	private String patientName;
	private String patientNic;
	private int patientAge;
	private String patientAddress;
	private int patientContactno;
	private String patientEmail;
	private String patientGender;
	private String patientUsername;
	private String patientPassword;
	private String patientConfirmPassword;

	public Patient(int patientUHID, String patientName, String patientNic, int patientAge,String patientAddress
			,int patientContactno,String patientEmail,String patientGender,String patientUsername,
			String patientPassword,String patientConfirmPassword) {
		this.patientUHID = patientUHID;
		this.patientName = patientName;
		this.patientNic = patientNic;
		this.patientAge = patientAge;
		this.patientAddress = patientAddress;
		this.patientContactno = patientContactno;
		this.patientEmail = patientEmail;
		this.patientGender = patientGender;
		this.patientUsername = patientUsername;
		this.patientPassword = patientPassword;
		this.patientConfirmPassword = patientConfirmPassword;

	}
	
	public Patient() {
	}

	public Patient(String patientName, String patientNic, int patientAge,String patientAddress,
			int patientContactno,String patientEmail,String patientGender,String patientUsername,
			String patientPassword,String patientConfirmPassword) {
		this.patientName = patientName;
		this.patientNic = patientNic;
		this.patientAge = patientAge;
		this.patientAddress = patientAddress;
		this.patientContactno = patientContactno;
		this.patientEmail = patientEmail;
		this.patientGender = patientGender;
		this.patientUsername = patientUsername;
		this.patientPassword = patientPassword;
		this.patientConfirmPassword = patientConfirmPassword;


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

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
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

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientUsername() {
		return patientUsername;
	}

	public void setPatientUsername(String patientUsername) {
		this.patientUsername = patientUsername;
	}

	public String getPatientPassword() {
		return patientPassword;
	}

	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}

	public String getPatientConfirmPassword() {
		return patientConfirmPassword;
	}

	public void setPatientConfirmPassword(String patientConfirmPassword) {
		this.patientConfirmPassword = patientConfirmPassword;
	}
	

}
