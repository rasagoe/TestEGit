package com.example.testjuno32;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class TestJuno32MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_juno32_main);

		TextView tv = (TextView)findViewById(R.id.textView1);
//		tv.setText("edit main activity");
//		tv.setText("edit main activity2");

		 tv.setText("take2 test1");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_test_juno32_main, menu);
		return true;
	}

}
