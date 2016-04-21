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
    private ListView mRosterListView;

    private String [] roster = new String[] {"#1 - Jamie Nanchen - Goalie", "#20 - Aaron Daniello - Goalie", "#30 - Liam Bohm-Meyer - Goalie",
            "#33 - Brenden Leise - Goalie", "#5 - Bryce Ebert - Defense", "#7 - Matteo Toneatto - Defense", "#9 - Michael Hennekens - Defense",
            "#15 - Chris Alberts - Defense", "#16 - Jacob Rushlow - Defense", "#24 - (A)Billy Wildman - Defense", "#96 - Keegan Kessler - Defense", "#97 - Travis Bobb - Defense",
            "#8 - Martin Cierny - Forward", "#10 - Kyle Stevens - Forward", "#12 - Brandon Aab - Forward", "#13 - Joel Lehtonen - Forward",
            "#14 - Paul Frys - Forward", "#17 - Jesse Vuorinen - Forward", "#18 - Grayson Szumilas - Forward","#21 - (C)Spence Cowand - Forward", "#42 - Ayrton Chapman - Forward",
            "#54 - Josh Davenport - Forward", "#88 - Vladislav Polyashov - Forward", "#89 - Simon Uppman - Forward", "#91 - Tuomas Korhonen - Forward", "#95 - Elijah Bordak - Forward",
            "#98 - Dustin Johnson - Forward"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roster);

        mRosterListView = (ListView) findViewById(R.id.rosterListView);
        ArrayAdapter goalieAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, roster);
        mRosterListView.setAdapter(goalieAdapter);

        mRosterListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String roster = ((TextView)view).getText().toString();
                Toast.makeText(RosterActivity.this, roster, Toast.LENGTH_LONG).show();
            }
        });



        //mGoaliesTextView = (TextView) findViewById(R.id.goaliesTextView);


    }
}
