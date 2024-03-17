package com.code.ABC_Lab.service;
import java.sql.SQLException;

import com.code.ABC_Lab.dao.ReservationManager;
import com.code.ABC_Lab.dao.ReservationManagerImpl;
import com.code.ABC_Lab.model.Reservation;

public class ReservationService {
	
	//Singleton
	
			private static ReservationService reservationServiceObj;
			
			private ReservationService() {
				
			}
			public synchronized static ReservationService getReservationService()
			{
				if (reservationServiceObj == null) {
					reservationServiceObj = new ReservationService();
				}
				
				return reservationServiceObj;
			}
			
			private ReservationManager getReservationManager()
			{
				return new ReservationManagerImpl();
			}
			
			public boolean insertNewReservation(Reservation reservation) throws SQLException, ClassNotFoundException {
				return getReservationManager().insertNewReservation(reservation);
			}


	}