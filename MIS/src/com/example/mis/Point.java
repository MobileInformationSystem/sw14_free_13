package com.example.mis;

public class Point {
	
	private String name;
	private String adress;
	private int id;
	private String category;
	private int rating_num;
	private int rating_sum;

	public Point(int param_id, String param_name,  String param_category, int param_rating_num, int param_rating_sum, String param_adress) {
		name = param_name;
		adress = param_adress;
		id = param_id;
		category = param_category;
		rating_num = param_rating_num;
		rating_sum = param_rating_sum;
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
	public int getRatingSum()
	{
		return rating_sum;
	}
	public int getRatingNum()
	{
		return rating_num;
	}	

}
