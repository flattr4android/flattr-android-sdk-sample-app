package com.flattr4android.example.sdk;

import com.flattr4android.sdk.FlattrButton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);

		LinearLayout ll = (LinearLayout) findViewById(R.id.button_prog_layout);
		FlattrButton button = new FlattrButton(this);
		button.setThingId(getString(R.string.sample_thing_id));
		button.setButtonStyle(FlattrButton.BUTTON_STYLE_HORIZONTAL);
		ll.addView(button);
	}
}
