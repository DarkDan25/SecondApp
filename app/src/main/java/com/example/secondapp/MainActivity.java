package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("On create test","Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("On start test","Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("On resume test","Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("On restart test","Restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("On pause test","Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("On stop test","Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("On destroy test","Destroy");
    }
}