package com.example.sidvaish.locatorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LaunchActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }

    public void maps(View view)
    {
        Intent intent = new Intent(LaunchActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
