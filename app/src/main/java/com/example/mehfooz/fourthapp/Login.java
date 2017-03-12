package com.example.mehfooz.fourthapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {
private  static Button btn;
    private static EditText uname;
    private static EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
    }

        public void login()
        {
            uname = (EditText) findViewById(R.id.name);
            password = (EditText) findViewById(R.id.editText3);


            btn = (Button) findViewById(R.id.button3);
            btn.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (uname.getText().toString().equals("mehfooz") && password.getText().toString().equals("mehfooz")) {
                                Toast.makeText(Login.this, "Valid credential", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(Login.this, "InValid credential", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
        }}






