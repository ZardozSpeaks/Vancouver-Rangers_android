package com.epicodus.vancouverrangers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.Bind;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.rosterButton) Button mRosterButton;
    @Bind(R.id.newsButton) Button mNewsButton;
    @Bind(R.id.contactButton) Button mContactButton;
    @Bind(R.id.scheduleButton) Button mScheduleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
