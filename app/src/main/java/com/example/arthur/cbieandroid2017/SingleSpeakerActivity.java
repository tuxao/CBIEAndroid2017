package com.example.arthur.cbieandroid2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SingleSpeakerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_speaker);

        Intent myIntent = getIntent();
        String speaker = myIntent.getStringExtra("speaker");

        TextView speakerName = (TextView) findViewById(R.id.single_speaker);

        speakerName.setText(speaker);
    }
}
