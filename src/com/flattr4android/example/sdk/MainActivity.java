/* Copyright (c) 2010-2012 Flattr4Android
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.flattr4android.example.sdk;

import com.flattr4android.sdk.FlattrButton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

/**
 * @author Philippe Bernard
 */
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
