package com.code.ABC_Lab.service;
import java.sql.SQLException;
import com.code.ABC_Lab.dao.PatientManager;
import com.code.ABC_Lab.dao.PatientManagerImpl;
import com.code.ABC_Lab.model.Patient;


public class PatientService {
	//Singleton
	
		private static PatientService patientServiceObj;
		
		private PatientService() {
			
		}
		public synchronized static PatientService getPatientService()
		{
			if (patientServiceObj == null) {
				patientServiceObj = new PatientService();
			}
			
			return patientServiceObj;
		}
		
		private PatientManager getPatientManager()
		{
			return new PatientManagerImpl();
		}
		
		public boolean insertNewPatient(Patient patient) throws SQLException, ClassNotFoundException {
			return getPatientManager().insertNewPatient(patient);
		}


}
