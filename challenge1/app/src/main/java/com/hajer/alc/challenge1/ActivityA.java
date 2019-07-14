package com.hajer.alc.challenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    public void goToAboutALC(View view){
        Intent activityBIntent = new Intent(ActivityA.this, ActivityB.class);
        startActivity(activityBIntent);
    }

    public void goToMyProfile(View view){
        Intent activityCIntent = new Intent(ActivityA.this, ActivityC.class);
        startActivity(activityCIntent);
    }
}
