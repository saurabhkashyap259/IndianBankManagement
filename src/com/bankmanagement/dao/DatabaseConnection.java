package com.bankmanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	public Connection getConnection() throws Exception {
		
		try {
			
			Connection c = null;
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/testuser","testuser", "testuser");
            
            return c;
 
        } catch (Exception e) {
        	throw e;
        }
 
	}

}
