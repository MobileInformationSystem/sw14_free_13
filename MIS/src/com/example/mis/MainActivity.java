package com.example.mis;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
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


public class MainActivity extends Activity implements OnClickListener  {

   private Button cmd_tug;
   private Button cmd_pois;
   private Button cmd_eat;
   private Button cmd_buy;
   private Button cmd_drink;
   
   private EditText in;
   


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
	     
	     
	     this.in= (EditText) this.findViewById(R.id.in);
      
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
	       in.setText("tug");
	        }
	    });
		
		
		cmd_pois.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
		       in.setText("cmd_pois");
	        }
	    });
		
		cmd_eat.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
		       in.setText("cmd_eat");
	        }
	    });
		
		cmd_buy.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
		       in.setText("cmd_buy");
	        }
	    });
		
		cmd_drink.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
		       in.setText("cmd_drink");
	        }
	    });
		
	}
}

 