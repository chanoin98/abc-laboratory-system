package com.code.ABC_Lab.dao;

import java.sql.SQLException;

import com.code.ABC_Lab.model.Patient;
import com.code.ABC_Lab.model.Test;


public interface PatientManager {
	public boolean insertNewPatient(Patient patient)throws SQLException, ClassNotFoundException;
	public Patient getSpecificPatient(int patientUHID)throws SQLException, ClassNotFoundException;

	


}
