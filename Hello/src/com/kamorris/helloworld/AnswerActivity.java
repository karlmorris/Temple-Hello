package com.kamorris.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AnswerActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_answer);
		
		
		int answer = getIntent().getIntExtra("theAnswer", 0);
		
		
		//((TextView) findViewById(R.id.answer_display)).setText(String.valueOf(answer));
		
		
		TextView answerTextView = new TextView(this);
		answerTextView.setText(String.valueOf(answer));
		answerTextView.setTextSize(50);
		
		LinearLayout ll = (LinearLayout) findViewById(R.id.answer_linear_layout);
		ll.setLayoutDirection(LinearLayout.HORIZONTAL);
		
		ll.addView(answerTextView);
		
		answerTextView = new TextView(this);
		
		answerTextView.setText(String.valueOf(answer));

		answerTextView.setTextSize(50);
		ll.addView(answerTextView);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
