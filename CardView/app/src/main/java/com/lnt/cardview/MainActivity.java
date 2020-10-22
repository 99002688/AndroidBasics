package com.lnt.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
public class MainActivity extends AppCompatActivity {
    ArrayList<String> personNames= new ArrayList<>(Arrays.asList("Jake Peralta","Amy Santiago","Rosa Diaz","Gina Linetti","Terry Jeffords","Raymond Holt","Charles Boyle"));
    ArrayList<String> personDetails= new ArrayList<>(Arrays.asList("Detective Jacob \"Jake\" Peralta is the main protagonist of the show. He is a cocky and immature but talented NYPD detective stationed in Brooklyn's 99th Precinct.","Sergeant Amy Santiago is a main character of the show. She is a sergeant and a former detective at the 99th precinct of the NYPD. Always eager to impress, Amy is looking for a mentor to help her achieve her dream of being the youngest person to be promoted to captain.","Detective Rosalita \"Rosa\" Diaz is a main character of the show. She is considered \"the tough guy\" and the \"badass\" in the Precinct. Rosa is scary, smart, secretive, and difficult to read. Most of the members of the precinct are frightened and a little disturbed by her. Rosa takes pride in the fact that no one knows much about her.","Regina \"Gina\" Linetti is a main character of the show. She was the 99th Precinct's sardonic civilian administrator. At the end of season two, she left The 99th Precinct to join Captain Raymond Holt, working at the NYPD's public relations office","Lieutenant Terrence Vincent \"Terry\" Jeffords is a main character of the show. He is a linebacker of a man who's lost his nerve, not because he's a wimp, but because a year prior to the series, his wife Sharon had twin baby girls; Cagney and Lacey, and he can't imagine not seeing them grow up.","Captain Raymond Jacob \"Ray\" Holt is one of the main characters of the show. He is the current Captain of the 99th Precinct and was formerly a uniformed officer. Outwardly he is strict, hardworking, stoic, staunchly professional, and a stickler for the rules. Inwardly, he is a warm, empathetic, devoted, and kind-hearted man who cares deeply about the officers and employees under his command and frequently participates in office antics, competitions, and pranks.","Detective Charles Boyle is a main character of the show. He is the precinct's workhorse. He is shown to be not that brilliant and not physically gifted, although he tries harder than anyone else."));
    ArrayList<Integer> images= new ArrayList<>(Arrays.asList(R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the refernce of reyclerView
        RecyclerView recyclerView = findViewById(R.id.firstview);
        //set a linear layout manager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        CustomLayout customLayout =new CustomLayout(this,personNames, personDetails,images);
        recyclerView.setAdapter(customLayout);//set the adapter to recyclerView
    }
}