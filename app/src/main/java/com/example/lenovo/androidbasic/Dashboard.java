package com.example.lenovo.androidbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    PreferenceManager preferenceManager;
    TextView text, num1, emailtxt, passtxt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        text=findViewById(R.id.welcome_text);
        num1=findViewById(R.id.name_text);
        emailtxt=findViewById(R.id.email_text);
        passtxt=findViewById(R.id.pass_text);


        preferenceManager = new PreferenceManager(getApplicationContext());

        String num = preferenceManager.getKeyValueStringRegister("num");
        num1.setText(num);
        String email1 = preferenceManager.getKeyValueStringRegister("email");
        emailtxt.setText(email1);
        String pass = preferenceManager.getKeyValueStringRegister("pass");
        passtxt.setText((CharSequence) pass);

    }
}
