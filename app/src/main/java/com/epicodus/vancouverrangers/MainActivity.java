package com.epicodus.vancouverrangers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.rosterButton) Button mRosterButton;
    @Bind(R.id.newsButton) Button mNewsButton;
    @Bind(R.id.contactButton) Button mContactButton;
    @Bind(R.id.scheduleButton) Button mScheduleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mContactButton.setOnClickListener(this);
        mNewsButton.setOnClickListener(this);
        mRosterButton.setOnClickListener(this);
        mScheduleButton.setOnClickListener(this);
    }

    @Override
    //buttons, buttons, buttons, button, buttons!!!
    public void onClick(View v) {
        if (v == mContactButton) {
            Intent intent = new Intent(MainActivity.this, ContactActivity.class);
            startActivity(intent);
        }

        if (v == mNewsButton) {
            Intent intent = new Intent(MainActivity.this, NewsActivity.class);
            startActivity(intent);
        }

        if (v == mRosterButton) {
            Intent intent = new Intent(MainActivity.this, RosterActivity.class);
            startActivity(intent);
        }

        if (v == mScheduleButton) {
            Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
            startActivity(intent);
        }
    }
}
