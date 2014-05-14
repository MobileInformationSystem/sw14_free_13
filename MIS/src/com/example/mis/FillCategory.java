package com.example.mis;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FillCategory {

	private DB_Connect connection;
	private ResultSet db_data;
	
	public FillCategory(String category) {
		connection = new DB_Connect();
		String sql = "SELECT * FROM MIS WHERE category='" +  category + "';";
		db_data = connection.readDatabase(sql);
		connection.close();
	}
	
	public List<Point> getPoints(){
		List<Point> points;
		try {
            while (db_data.next()) {
            	points.add(new Point());
            	
            }   } catch (SQLException ex) {
        }
		
		return points;
		
		
	}

}
