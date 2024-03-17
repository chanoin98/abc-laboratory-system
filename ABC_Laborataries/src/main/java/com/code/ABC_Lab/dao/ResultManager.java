package com.code.ABC_Lab.dao;
import java.sql.SQLException;

import com.code.ABC_Lab.model.Patient;
import com.code.ABC_Lab.model.Result;
import com.code.ABC_Lab.model.Test;


public interface ResultManager {
	public boolean insertNewResult(Result result)throws SQLException, ClassNotFoundException;
	public Result getSpecificResult(int testRefno)throws SQLException, ClassNotFoundException;



}
