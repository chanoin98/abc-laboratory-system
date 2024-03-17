package com.code.ABC_Lab.service;
import java.sql.SQLException;
import com.code.ABC_Lab.dao.ResultManager;
import com.code.ABC_Lab.dao.ResultManagerImpl;
import com.code.ABC_Lab.model.Result;
import com.code.ABC_Lab.model.Test;


public class ResultService {
	//Singleton
	
			private static ResultService resultServiceObj;
			
			private ResultService() {
				
			}
			public synchronized static ResultService getResultService()
			{
				if (resultServiceObj == null) {
					resultServiceObj = new ResultService();
				}
				
				return resultServiceObj;
			}
			
			private ResultManager getResultManager()
			{
				return new ResultManagerImpl();
			}
			
			public boolean insertNewResult(Result result) throws SQLException, ClassNotFoundException {
				return getResultManager().insertNewResult(result);
			}
			public Result getSpecificResult(int testRefno) throws SQLException, ClassNotFoundException {
				return getResultManager().getSpecificResult(testRefno);
			}
			
			
	}