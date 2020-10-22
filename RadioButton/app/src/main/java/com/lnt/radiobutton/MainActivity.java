package com.lnt.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;

    String answer;

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1 =(RadioButton) findViewById(R.id.radioButton1);
        radioButton2 =(RadioButton) findViewById(R.id.radioButton2);
        radioButton3 =(RadioButton) findViewById(R.id.radioButton3);
        radioButton4 =(RadioButton) findViewById(R.id.radioButton4);
        submit =(Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButton1.isChecked()) {
                    answer=radioButton1.getText().toString();
                } else if (radioButton2.isChecked()){
                    answer=radioButton2.getText().toString();
                } else if (radioButton3.isChecked()){
                    answer=radioButton3.getText().toString();
                } else if (radioButton4.isChecked()){
                    answer=radioButton4.getText().toString();
                }
                Toast.makeText(getApplicationContext(),answer, Toast.LENGTH_LONG).show();


            }
        });
    }
}