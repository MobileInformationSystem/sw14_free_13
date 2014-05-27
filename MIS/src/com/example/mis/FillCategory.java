package com.example.mis;

import java.util.Vector;

public class FillCategory {

	private String category;
	private Vector<Point> points;
	private Vector<Point> data_points;
	private dataStorage db;

	public FillCategory() {
		points = null;
	}
	
	public FillCategory(String param_category, dataStorage param_db) {
		points = new Vector<Point>();
        setCategory(param_category, param_db);
	}


	public void getData()
	{
		
		String db_name;
		int db_id;
		String db_category;
		int db_rating_num;
		int db_rating_sum;
		String db_map;
		
		data_points = new Vector<Point>();
		

	data_points.add(new Point(1, "Objekt1", category, 0, 0, "Inffeldgasse 16, Graz"));	
	data_points.add(new Point(2, "Objekt2", category, 0, 0, "Hauptplatz, Graz"));
	data_points.add(new Point(3, "Objekt3", category, 0, 0, "Hauptbahnhof, Graz"));
	data_points.add(new Point(3, "Objekt4", category, 0, 0, "Jakominiplatz, Graz"));
    points = data_points;
	}
	
	public void setCategory(String param_category, dataStorage param_db)
	{
		if (points != null)
		{
		    points.removeAllElements();			
		}
		category = param_category;
		db = param_db;
		getData();
		
	}
	
	public int getSize()
	{
		return points.size();
	}
	

}
