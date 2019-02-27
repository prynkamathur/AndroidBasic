package com.example.lenovo.androidbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SharedPreference extends AppCompatActivity {

    ImageView logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);


        logo=findViewById(R.id.logo);


        Thread Timer = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally
                {
                    Intent intent = new Intent(SharedPreference.this,Register.class);
                    startActivity(intent);
                    finish();

                }
            }
        };

        Timer.start();

    }

}
