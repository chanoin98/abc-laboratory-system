package com.code.ABC_Lab.dao.dbutils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbDriverManagerMySqlImpl implements DbDriverManager{

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url ="jdbc:mysql://127.0.0.1:3306/abc_lab";
		String username="root";
		String password = "12345";
		
		return DriverManager.getConnection(url, username, password);
	}

}
