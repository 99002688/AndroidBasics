package com.lnt.timepicker;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    TextView time;
    TimePicker simpleTimePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time = (TextView) findViewById(R.id.time);
        simpleTimePicker = (TimePicker) findViewById(R.id.simpleTimePicker);
        simpleTimePicker.setIs24HourView(false);
        simpleTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                //Toast.makeText(getApplicationContext(), hourOfDay + " " + minute, Toast.LENGTH_SHORT).show();
                if(hourOfDay>12)
                {
                    hourOfDay=hourOfDay-12;
                    time.setText("Time is  " + hourOfDay + " : " + minute + " PM");
                }
                else if(hourOfDay<12)
                {
                    time.setText("Time is  " + hourOfDay + " : " + minute + " AM");
                }
            }
        });
    }
}