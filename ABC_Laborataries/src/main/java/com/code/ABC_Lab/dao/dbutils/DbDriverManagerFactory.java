package com.code.ABC_Lab.dao.dbutils;

public class DbDriverManagerFactory {

	
	public DbDriverManager getDbDriver(String databaseType)
	{
		if(databaseType.equals("MySQL"))
		{
			return new DbDriverManagerMySqlImpl();
		}
		else
		{
			return null;
		}
	}

}
