package com.epicodus.vancouverrangers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class RosterActivity extends AppCompatActivity {
    //private TextView mGoaliesTextView;
    private ListView mGoaliesListView;

    //private TextView mDefenseTextView;
    private ListView mDefenseListView;

    private String [] goalies = new String[] {"#1 - Jamie Nanchen", "#20 - Aaron Daniello", "#30 - Liam Bohm-Meyer", "#33 - Brenden Leise"};
    private String [] defensemen = new String[] {"#5 - Bryce Ebert", "#7 - Matteo Toneatto", "#9 - Michael Hennekens",
            "#15 - Chris Alberts", "#16 - Jacob Rushlow", "#24 - Billy Wildman 'A'", "#96 - Keegan Kessler", "#97 - Travis Bobb"};
    private String [] forwards = new String[] {"#Martin Cierny", "#10 - Kyle Stevens", "#12 - Brandon Aab", "#13 - Joel Lehtonen",
            "#14 - Paul Frys", "#17 - Jesse Vuorinen", "#18 - Grayson Szumilas","#21 - Spence Cowand 'C'", "#42 - Ayrton Chapman",
            "#54 - Josh Davenport", "#88 - Vladislav Polyashov", "#89 - Simon Uppman", "#91 - Tuomas Korhonen", "#95 - Elijah Bordak",
            "#98 - Dustin Johnson"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roster);

        mGoaliesListView = (ListView) findViewById(R.id.goaliesListView);
        ArrayAdapter goalieAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, goalies);
        mGoaliesListView.setAdapter(goalieAdapter);

        mGoaliesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String goalies = ((TextView)view).getText().toString();
                Toast.makeText(RosterActivity.this, goalies, Toast.LENGTH_LONG).show();
            }
        });



        //mGoaliesTextView = (TextView) findViewById(R.id.goaliesTextView);


    }
}
