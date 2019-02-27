package com.example.lenovo.androidbasic;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    EditText number, email, password;
    Button register;
    TextView login;

    private PreferenceManager preferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        number=findViewById(R.id.MobileNum);
        email=findViewById(R.id.email1);
        password=findViewById(R.id.Password1);
        register=findViewById(R.id.Register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SubmitBtn();

            }
        });

//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent x = new Intent(getApplicationContext(), Login.class);
//                startActivity(x);
//
//            }
//        });

    }

    public void SubmitBtn()
    {
        String num = number.getText().toString();
        String email1 = email.getText().toString();
        String pass = password.getText().toString();


        preferenceManager = new PreferenceManager(this);
        preferenceManager.setLoginSession(email1);

        preferenceManager.setKeyValueStringRegister("number",num);
        preferenceManager.setKeyValueStringRegister("email",email1);
        preferenceManager.setKeyValueStringRegister("pass",pass);

       Intent move = new Intent(getApplicationContext(), Login.class);
        startActivity(move);
    }

}
