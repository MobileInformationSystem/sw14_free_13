package com.example.mis;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Connect {

    Driver mySqlDriver;  // JDBC-Treiber
    Connection conn;
    Statement stm;
	
    public DB_Connect() {
    	

    	try {
    		mySqlDriver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
    		DriverManager.registerDriver(mySqlDriver);
    		conn = DriverManager.getConnection("jdbc:mysql://sql2.freesqldatabase.com:3306/sql239050 ", "sql239050", "kJ3%pV1!");
    		stm = conn.createStatement();
    		System.out.println("Conn created");
    	} catch (SQLException ex) {
    		ex.printStackTrace();
    	} catch (ClassNotFoundException ex) {
    		ex.printStackTrace();
    	} catch (InstantiationException ex) {
    		ex.printStackTrace();
    	} catch (IllegalAccessException ex) {
    		ex.printStackTrace();
    	}
    }
   
    public ResultSet readDatabase(String sqlRequest) {
    	//get entries from the given database -> takes whole sql request for individual output
            ResultSet rs = null;  //initialize results

            Statement stat = null;

            try {
                //request data from database
                stat = conn.createStatement();
                rs = stat.executeQuery(sqlRequest);
                return rs;	//return ResultSet - easier to work on with data
            } catch (Exception e) {
                return null;
            }
        }

        public void close() {
    	//close connection
            try {
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    
}
