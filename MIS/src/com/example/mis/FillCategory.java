package com.example.mis;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

public class FillCategory {

	private DB_Connect connection;
	private ResultSet db_data;
	private String category;
	private Vector<Point> points;

	public FillCategory() {
		points = null;
	}
	
	public FillCategory(String param_category) {
		points = null;
        setCategory(param_category);
	}
	
	public void getDataFromDB()
	{
		connection = new DB_Connect();
		String sql = "SELECT * FROM MIS WHERE category='" + category + "';";
		db_data = connection.readDatabase(sql);
		connection.close();
	}

	public void getData()
	{
		getDataFromDB();
		
		String db_name;
		int db_id;
		String db_category;
		int db_rating_num;
		int db_rating_sum;
		String db_map;
		
		Vector<Point> data_points = null;
	try {
		while (db_data.next()) {
			db_name = db_data.getString("Name");
			db_id = db_data.getInt("ID");
			db_category = db_data.getString("Category");
			db_rating_num = db_data.getInt("Rating_Num");
			db_rating_sum = db_data.getInt("Rating_Sum");
			db_map = db_data.getString("Map");
			
			data_points.add(new Point(db_id, db_name, db_category, db_rating_num, db_rating_sum, db_map));
		}
	} catch (SQLException e) {
	    }
    points = data_points;
	}
	
	public void setCategory(String param_category)
	{
		points.removeAllElements();
		category = param_category;
		getData();
		
	}
	
	public Vector<Point> getPoints()
	{
		return points;
	}
	

}
