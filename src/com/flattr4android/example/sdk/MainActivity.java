package com.flattr4android.example.sdk;

import com.flattr4android.sdk.FlattrButton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if ((getString(R.string.token).length() < 10)
				|| (getString(R.string.token_secret).length() < 10)) {
			setContentView(R.layout.setup);
		} else {
			setContentView(R.layout.main);

			LinearLayout ll = (LinearLayout) findViewById(R.id.button_prog_layout);
			FlattrButton button = new FlattrButton(this);
			button.setFlattrCredentials(getString(R.string.token),
					getString(R.string.token_secret));
			button.setThingId(getString(R.string.sample_thing_id));
			button.setButtonStyle(FlattrButton.BUTTON_STYLE_HORIZONTAL);
			ll.addView(button);
		}
	}
}
