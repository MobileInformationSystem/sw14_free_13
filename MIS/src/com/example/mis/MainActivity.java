package com.example.mis;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;


public class MainActivity extends ActionBarActivity implements OnClickListener  {

   private Button cmd_tug;
   private Button cmd_pois;
   private Button cmd_eat;
   private Button cmd_buy;
   private Button cmd_drink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        

        
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {


        public PlaceholderFragment() {
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }


	@Override
	public void onClick(View view) {
		 }
		
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	    View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        this.cmd_tug = (Button) this.findViewById(R.id.cmdTUG);
        this.cmd_pois = (Button) this.findViewById(R.id.cmd_POIs);
        this.cmd_eat = (Button) this.findViewById(R.id.cmd_eat);
        this.cmd_buy = (Button) this.findViewById(R.id.cmd_buy);
        this.cmd_drink = (Button) this.findViewById(R.id.cmd_drink);


	    cmd_tug.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        }
	    });
	    
	    cmd_pois.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        }
	    });
	    
	    cmd_eat.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        }
	    });
	    
	    cmd_buy.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        }
	    });
	    
	    cmd_drink.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        }
	    });

	    return rootView;
	}


}
