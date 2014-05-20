package com.example.mis;

import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class ListViewActivity extends MainActivity implements OnClickListener {
	ListView listView;
	private EditText txt_category;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listview);

		this.txt_category = (EditText) this.findViewById(R.id.txt_category);

        Category category = (Category) getIntent().getSerializableExtra("cat");
        String pressed_button = category.getCategory();
       
		String tug = "TUG";
		String pois = "POIs";
		String eatIt = "Eat It";
		String drinkIt = "Drink It";
		String buyIt = "Buy It";

		
		if (tug.equals(pressed_button))
		{
			txt_category.setText("tug");
     	}
		else if (pois.equals(pressed_button))
		{
			txt_category.setText("pois");
		}
		else if (eatIt.equals(pressed_button))
		{
			txt_category.setText("eat it");
		}
		else if (drinkIt.equals(pressed_button))
		{
			txt_category.setText("drink it");
		}
		else if (buyIt.equals(pressed_button))
		{
			txt_category.setText("buy it");
		}
		else
		{
			txt_category.setText("FAIL");
		}
		

		
		// Get ListView object from xml
	    // listView = (ListView) findViewById(R.id.list);
		
		// CustomAdapter customAdapter = new CustomAdapter();
		// listView.setAdapter(customAdapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}
}
