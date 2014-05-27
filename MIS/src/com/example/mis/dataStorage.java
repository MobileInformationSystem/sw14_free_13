package com.example.mis;

import java.util.Vector;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class dataStorage extends SQLiteOpenHelper {
	
    private static final int DATABASE_VERSION = 1;
    
    // Database Name
    private static final String DATABASE_NAME = "points.db";
 
    // Contacts table name
    private static final String TABLE_POINTS = "points";
 
    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_CATEGORY = "category";
    private static final String KEY_RATING_NUM = "rating_numbers";
    private static final String KEY_RATING_SUM = "rating_sum";
    private static final String KEY_ADDRESS = "address";

	
	
	

	public dataStorage(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
        String CREATE_POINTS_TABLE = "CREATE TABLE " + TABLE_POINTS + "("
                + KEY_ID + " INTEGER," + KEY_NAME + " TEXT," + KEY_CATEGORY + " TEXT,"
                + KEY_RATING_NUM + " INTEGER," + KEY_RATING_SUM + " INTEGER," + KEY_ADDRESS + " TEXT" + ")";
        db.execSQL(CREATE_POINTS_TABLE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_POINTS);

        onCreate(db);

		
	}
	
	public void addPoint (Point point)
	{

		SQLiteDatabase db = this.getWritableDatabase();
		 
	    ContentValues values = new ContentValues();
	    values.put(KEY_ID, point.getId());
	    values.put(KEY_NAME, point.getName());
	    values.put(KEY_CATEGORY, point.getCategory());
	    values.put(KEY_RATING_NUM, point.getRatingNum());
	    values.put(KEY_RATING_SUM, point.getRatingSum());
	    values.put(KEY_ADDRESS, point.getAddress());
	 
	    db.insert(TABLE_POINTS, null, values);
	    db.close(); 

	}
	
	public Vector<Point> getPoints(String category)
	{
		return null;

	}

	public Vector<Point> getPoints()
	{
		 Vector<Point> points = new Vector<Point>();

		    String selectQuery = "SELECT  * FROM " + TABLE_POINTS + "";
		 
		    SQLiteDatabase db = this.getWritableDatabase();
		    Cursor cursor = db.rawQuery(selectQuery, null);
		 
		    int id;
		    String name;
		    String category;
		    int rating_num;
		    int rating_sum;
		    String address;
		    
		    if (cursor.moveToFirst()) {
		        do {
		        	id = Integer.parseInt(cursor.getString(0));
		        	name = cursor.getString(1);
		        	category = cursor.getString(2);
		        	rating_num = Integer.parseInt(cursor.getString(3));
		        	rating_sum = Integer.parseInt(cursor.getString(4));
		        	//address = cursor.getString(5);
		        	
		            //Point point = new Point(Integer.parseInt(cursor.getString(0)),cursor.getString(1),cursor.getString(2),Integer.parseInt(cursor.getString(3)),Integer.parseInt(cursor.getString(4)),cursor.getString(5));
		            //points.add(point);
		        } while (cursor.moveToNext());
		    }
		 
		    return points;


	}
	
	public int getSize()
	{

	       String countQuery = "SELECT  * FROM " + TABLE_POINTS;
	        SQLiteDatabase db = this.getReadableDatabase();
	        Cursor cursor = db.rawQuery(countQuery, null);
	        cursor.close();
	 
	        // return count
	        return cursor.getCount();



	}
	
}
