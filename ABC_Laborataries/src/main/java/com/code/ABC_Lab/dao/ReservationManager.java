package com.code.ABC_Lab.dao;
import java.sql.SQLException;

import com.code.ABC_Lab.model.Reservation;

public interface ReservationManager {
	public boolean insertNewReservation(Reservation reservation)throws SQLException, ClassNotFoundException;


}
