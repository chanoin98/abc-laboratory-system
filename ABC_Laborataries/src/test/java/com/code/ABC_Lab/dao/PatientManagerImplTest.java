package com.code.ABC_Lab.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PatientManagerImplTest {

	private PatientManagerImpl labSystem;

    @BeforeEach
    public void setUp() {
        labSystem = new PatientManagerImpl();
    }
    @Test
    public void insertNewPatientSuccess() {
        HashMap<String, String> Patient = new HashMap<>();
        Patient.put("patientUHID", "1100");
        Patient.put("patientName", "Tom");
        Patient.put("patientNic", "984578745v");
        Patient.put("patientAge", "23");
        Patient.put("patientAddress", "Kandy");
        Patient.put("patientContactno", "0745989854");
        Patient.put("patientEmail", "tom@gmail.com");
        Patient.put("patientGender", "Male");
        Patient.put("patientUsername", "Tom");
        Patient.put("patientPassword", "Tom");
        Patient.put("patientConfirmPassword", "Tom");



        String patientUHID = labSystem.insertNewPatient(Patient);
        assertNotNull(patientUHID);
    }
    
    
    

}