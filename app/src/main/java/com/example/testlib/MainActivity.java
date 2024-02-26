package com.example.testlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.testmodule.TestModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestModule.logEvent(this);
    }
}