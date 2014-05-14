package com.example.mis;

public class Point {
	
	private String name;
	private String adress;
	private int id;
	private String category;

	public Point(String param_name, String param_adress, String param_category, int param_id) {
		name = param_name;
		adress = param_adress;
		id = param_id;
		category = param_category;
	}
	
	
	public Point(){}
	
	public String getName()
	{
		return name;
	}
	
	public String getAdress()
	{
		return adress;
	}
	public String getCategory()
	{
		return category;
	}
	
	public int getId()
	{
		return id;
	}

}
