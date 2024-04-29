package com.praktikum.myfourthandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    static final String tag = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(tag, "ini di onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(tag, "ini di onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(tag, "ini di onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(tag, "ini di onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(tag, "ini di onDestroy");
    }
}
