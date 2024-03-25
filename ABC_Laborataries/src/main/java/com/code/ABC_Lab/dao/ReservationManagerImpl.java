package com.code.ABC_Lab.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.code.ABC_Lab.dao.dbutils.DbDriverManager;
import com.code.ABC_Lab.dao.dbutils.DbDriverManagerFactory;
import com.code.ABC_Lab.model.Reservation;


public class ReservationManagerImpl implements ReservationManager {

public ReservationManagerImpl() {
		
	}
	
	private Connection getConnection() throws ClassNotFoundException, SQLException
	{
		DbDriverManagerFactory driverFactory = new DbDriverManagerFactory();
		DbDriverManager driverManager = driverFactory.getDbDriver("MySQL");


		return driverManager.getConnection();
	}
	
	public boolean insertNewReservation(Reservation reservation) throws SQLException, ClassNotFoundException {
		
		Connection connection = getConnection();
		
		String query = "INSERT INTO reservation (patientUHID,patientName,patientNic,patientAge,patientContactno,patientEmail,testCode,testName,docName,testTimeslot)VALUES (?,?,?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1,  reservation.getPatientUHID());
		ps.setString(2,  reservation.getPatientName());
		ps.setString(3,  reservation.getPatientNic());
		ps.setInt(4,  reservation.getPatientAge());
		ps.setInt(5, reservation.getPatientContactno());
		ps.setString(6,  reservation.getPatientEmail());
		ps.setInt(7, reservation.getTestCode());
		ps.setString(8,  reservation.getTestName());
		ps.setString(9,  reservation.getDocName());
		ps.setString(10,  reservation.getTestTimeslot());

		boolean result = false;
		
		if(ps.executeUpdate()>0)
			result = true;
		ps.close();
		connection.close();
		return result;
	}


}

