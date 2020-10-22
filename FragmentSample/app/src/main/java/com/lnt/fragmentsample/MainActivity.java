package com.lnt.fragmentsample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button FirstFragment, SecondFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment = (Button) findViewById(R.id.FirstFragment);
        SecondFragment = (Button) findViewById(R.id.SecondFragment);

        final Bundle bundle = new Bundle();
        bundle.putString("message","From Activity to Fragment");


        FirstFragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                loadFragment(new FirstFragment());
            }
        });

        SecondFragment.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                loadFragment(new SecondFragment());
            }
        });

    }

    private void loadFragment(Fragment fragment) {


        //set Fragmentclass Arguments

        // create a FragmentManager
        FragmentManager fm = getFragmentManager();
        // create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        // replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.FrameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}