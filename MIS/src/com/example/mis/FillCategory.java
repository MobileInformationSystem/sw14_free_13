package com.example.mis;

import java.util.Vector;

public class FillCategory {

	private String category;
	private Vector<Point> points;
	private Vector<Point> data_points;

	public FillCategory() {
		points = null;
	}
	
	public FillCategory(String param_category) {
		points = null;
        setCategory(param_category);
	}


	public void getData()
	{
		//getDataFromDB();
		
		String db_name;
		int db_id;
		String db_category;
		int db_rating_num;
		int db_rating_sum;
		String db_map;
		
		data_points = null;
		/*while () {
			db_name = db_data.getString("Name");
			db_id = db_data.getInt("ID");
			db_category = db_data.getString("Category");
			db_rating_num = db_data.getInt("Rating_Num");
			db_rating_sum = db_data.getInt("Rating_Sum");
			db_map = db_data.getString("Map");*/
		

	data_points.add(new Point(1, "Objekt1", category, 0, 0, "Inffeldgasse 16, Graz"));	
	data_points.add(new Point(2, "Objekt2", category, 0, 0, "Hauptplatz, Graz"));
	data_points.add(new Point(3, "Objekt3", category, 0, 0, "Hauptbahnhof, Graz"));
	data_points.add(new Point(3, "Objekt4", category, 0, 0, "Jakominiplatz, Graz"));
    points = data_points;
	}
	
	public void setCategory(String param_category)
	{
		if (points != null)
		{
		    points.removeAllElements();			
		}
		category = param_category;
		getData();
		
	}
	
	public Vector<Point> getPoints()
	{
		return points;
	}
	

}
