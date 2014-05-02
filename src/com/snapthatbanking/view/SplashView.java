package com.snapthatbanking.view;

import com.prototype.snapthatbanking.R;
import com.prototype.snapthatbanking.R.layout;
import com.prototype.snapthatbanking.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SplashView extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_view);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash_view, menu);
		return true;
	}

}
