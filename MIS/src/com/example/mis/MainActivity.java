package com.example.mis;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
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

public class MainActivity extends Activity implements OnClickListener {

	private Button cmd_tug;
	private Button cmd_pois;
	private Button cmd_eat;
	private Button cmd_buy;
	private Button cmd_drink;
	
	private dataStorage db;

	private EditText txt_buttonPressed;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
        db = new dataStorage(this);
    	db.addPoint(new Point(1, "Objekt1", "TUG", 0, 0, "Inffeldgasse 16"));	
    	db.addPoint(new Point(2, "Objekt2", "POI", 0, 0, "Hauptplatz"));
    	db.addPoint(new Point(3, "Objekt3", "EAT", 0, 0, "Hauptbahnhof"));
    	db.addPoint(new Point(4, "Objekt4", "DRINK", 0, 0, "Jakominiplatz"));
    	db.addPoint(new Point(5, "Objekt4", "BUY", 0, 0, "Jakominiplatz"));
		

		setContentView(R.layout.activity_main);

		this.cmd_tug = (Button) this.findViewById(R.id.cmdTUG);
		this.cmd_tug.setOnClickListener(this);

		this.cmd_pois = (Button) this.findViewById(R.id.cmd_POIs);
		this.cmd_pois.setOnClickListener(this);

		this.cmd_eat = (Button) this.findViewById(R.id.cmd_eat);
		this.cmd_eat.setOnClickListener(this);

		this.cmd_buy = (Button) this.findViewById(R.id.cmd_buy);
		this.cmd_buy.setOnClickListener(this);

		this.cmd_drink = (Button) this.findViewById(R.id.cmd_drink);
		this.cmd_drink.setOnClickListener(this);

		this.txt_buttonPressed = (EditText) this
				.findViewById(R.id.txt_buttonPressed);

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

		cmd_tug.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				txt_buttonPressed.setText("TUG");

				Category cat = new Category();
				cat.setCategory("TUG");

				Intent intent = new Intent(MainActivity.this,
						ListViewActivity.class);
				intent.putExtra("cat", cat);
				startActivity(intent);
			}
		});

		cmd_pois.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				txt_buttonPressed.setText("POIs");

				Category cat = new Category();
				cat.setCategory("POIs");

				Intent intent = new Intent(MainActivity.this,
						ListViewActivity.class);
				intent.putExtra("cat", cat);
				startActivity(intent);
			}
		});

		cmd_eat.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				txt_buttonPressed.setText("Eat It");

				Category cat = new Category();
				cat.setCategory("Eat It");

				Intent intent = new Intent(MainActivity.this,
						ListViewActivity.class);
				intent.putExtra("cat", cat);
				startActivity(intent);
			}
		});

		cmd_buy.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				txt_buttonPressed.setText("Buy It");

				Category cat = new Category();
				cat.setCategory("Buy It");

				Intent intent = new Intent(MainActivity.this,
						ListViewActivity.class);
				intent.putExtra("cat", cat);
				startActivity(intent);
			}
		});

		cmd_drink.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				txt_buttonPressed.setText("Drink It");

				Category cat = new Category();
				cat.setCategory("Drink It");

				Intent intent = new Intent(MainActivity.this,
						ListViewActivity.class);
				intent.putExtra("cat", cat);
				startActivity(intent);
			}
		});

	}

}
