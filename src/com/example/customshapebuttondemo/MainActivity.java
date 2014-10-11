package com.example.customshapebuttondemo;
/*
 * zen_button ref: http://developerlife.com/tutorials/?p=1239
 * Ref: zzzz: http://stackoverflow.com/questions
 * 		/18074303/how-to-create-custom-shape-button-with-selector-in-android
 * shapes and colors: http://stackoverflow.com/questions
 * 		/13861416/android-custom-shape-button
 * h_button derived from zzzz with additional research for the
 *      use of style for setting button options.
 * 
 */

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity {
	private static final String logTag = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		((RadioGroup)findViewById(R.id.radioButtons))
			.setOnCheckedChangeListener(radioButtonChanged());
		((RadioGroup)findViewById(R.id.customRadioButtons))
			.setOnCheckedChangeListener(radioButtonChanged());
	}
	private OnCheckedChangeListener radioButtonChanged () {
		return new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int button) {
				Log.i(logTag, String.format("onCheckedChanged: " +
						"group id = 0x%08x, button id = 0x%08x"
						, group.getId(), button));
				
			}
		};
	}
	public void onRadioGroupClicked(View view) {
		Log.i(logTag, String.format("onRadioGroupClicked: id = 0x%08x", view.getId()));
	}
}
