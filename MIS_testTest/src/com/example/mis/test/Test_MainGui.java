package com.example.mis.test;

import com.example.mis.MainActivity;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class Test_MainGui extends ActivityInstrumentationTestCase2<MainActivity> {

	private Solo mySolo;
	public Test_MainGui() {
      super(MainActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		mySolo = new Solo(getInstrumentation(), getActivity());
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testCmds()
	{
		mySolo.clickOnButton("TUG");
		mySolo.clickOnButton("POIs");
		mySolo.clickOnButton("Eat it");
		mySolo.clickOnButton("Drink it");
		mySolo.clickOnButton("Buy it");
	}
}
