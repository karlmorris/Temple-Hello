package com.kamorris.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText operandA, operandB;
	Button button_addition;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_calculator);
		
		operandA = (EditText) findViewById(R.id.operandA);
		operandB = (EditText) findViewById(R.id.operandB);
		button_addition = (Button) findViewById(R.id.addition);
		
		
		View.OnClickListener listener = new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				try {
					int num1 = Integer.parseInt(operandA.getText().toString());
					int num2 = Integer.parseInt(operandB.getText().toString());
					
					int answer = num1 + num2;
					
					Intent answerIntent = 
							new Intent(MainActivity.this, 
							AnswerActivity.class);
					
					answerIntent.putExtra("theAnswer", answer);
					
					startActivity(answerIntent);
				} catch (Exception e) {
					Toast.makeText(MainActivity.this, 
							"Please enter two numbers", 
							Toast.LENGTH_LONG).show();
				}
			}
		};
		
		
		button_addition.setOnClickListener(listener);
		
	}

}
