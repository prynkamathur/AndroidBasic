package com.example.lenovo.androidbasic.ActivityLifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.lenovo.androidbasic.R;

public class Lifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("##", "OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("##", "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("##", "OnPause");
    }
}
