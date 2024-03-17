package com.code.ABC_Lab.dao;

import java.sql.SQLException;

import com.code.ABC_Lab.model.Patient;


public interface PatientManager {
	public boolean insertNewPatient(Patient patient)throws SQLException, ClassNotFoundException;
	


}
