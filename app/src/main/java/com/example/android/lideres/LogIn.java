package com.example.android.lideres;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LogIn extends AppCompatActivity implements View.OnClickListener{
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch(view.getId()){
            case R.id.login:
            Estudiante estudiante = new Estudiante();
                break;
        }
    }
}
