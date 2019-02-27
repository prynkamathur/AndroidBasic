package com.example.lenovo.androidbasic;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText number, password;
    Button login, create;

    private PreferenceManager preferenceManager;
//    private static final String Key_number = "Number";
//    private static final String Key_pass = "Password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        SharedPreferences.Editor editor = pref.edit();
        number=findViewById(R.id.Number);
        password=findViewById(R.id.paytm_password);
        login=findViewById(R.id.Login);
        create=findViewById(R.id.create);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

           Login();
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent xyz = new Intent(getApplicationContext(), Register.class);
                startActivity(xyz);

            }
        });



    }

    public void Login()
    {
        String num = number.getText().toString();
        String pass = password.getText().toString();

        if (num.isEmpty())
        {
            number.setError("Enter the mobile number");
            return;

        }
        if (!pass.equals("1234"))
        {
            password.setError("Enter correct password");
            return;
        }

        preferenceManager = new PreferenceManager(getApplicationContext());
        preferenceManager.setLoginSession(num);
        preferenceManager.setKeyValueString("num", num);

        Intent move = new Intent(getApplicationContext(), Dashboard.class);
        startActivity(move);

    }


}
