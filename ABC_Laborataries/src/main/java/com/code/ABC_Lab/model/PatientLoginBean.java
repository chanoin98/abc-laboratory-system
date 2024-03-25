package com.code.ABC_Lab.model;

import java.io.Serializable;

public class PatientLoginBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String patientUsername;
    private String patientPassword;

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
}

