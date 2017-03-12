package com.example.mehfooz.fourthapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.mehfooz.fourthapp.R.styleable.View;

public class MainActivity extends AppCompatActivity {
    private static Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openLogin();
        openRegisteration();
    }

    public void openLogin()
    {
        btn= (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent("com.example.mehfooz.fourthapp.Login");
                startActivity(intent);
            }
        });
    }

    public void openRegisteration()
    {
        btn= (Button)findViewById(R.id.button2);
        btn.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent intent=new Intent("com.example.mehfooz.fourthapp.registeration");
                        startActivity(intent);
                    }
                }
        );
    }
}
