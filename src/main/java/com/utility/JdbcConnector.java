package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnector {
	
	//public static Resultset result;
	
	public static String getParticularData() throws SQLException {
		String url="jdbc:mysql//localhost:3306/employees";
		String username="root";
		String password="root";
		String query="Select * from employees limit 10";
		
		//Connection Establize
		Connection connection=DriverManager.getConnection(url,username,password);
		//create statement 
		Statement statement=connection.createStatement();
		//Execute Query
		ResultSet result=statement.executeQuery(query);
		result.next();
		
		String firstname=result.getString(3);
		
		return firstname;
				
	}
	public static void main(String[] args) throws SQLException{
		getParticularData();
		}
	

		
	}
	 



