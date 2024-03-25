package com.code.ABC_Lab.dao;
import java.sql.SQLException;

import com.code.ABC_Lab.model.LabResult;


public interface ResultManager {
	public boolean insertNewResult(LabResult labResult)throws SQLException, ClassNotFoundException;
	public LabResult getSpecificResult(int testRefno)throws SQLException, ClassNotFoundException;



}
