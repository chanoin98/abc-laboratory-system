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
		
		String query = "INSERT INTO reservation (patientName,patientAge,patientContactno,patientEmail,testName,testCode,refDoc,testTimeslot)VALUES (?,?,?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1,  reservation.getPatientName());
		ps.setInt(2,  reservation.getPatientAge());
		ps.setInt(3, reservation.getPatientContactno());
		ps.setString(4,  reservation.getPatientEmail());
		ps.setString(5,  reservation.getTestName());
		ps.setInt(6, reservation.getTestCode());
		ps.setString(7,  reservation.getRefDoc());
		ps.setString(8,  reservation.getTestTimeslot());

		boolean result = false;
		
		if(ps.executeUpdate()>0)
			result = true;
		ps.close();
		connection.close();
		return result;
	}


}

