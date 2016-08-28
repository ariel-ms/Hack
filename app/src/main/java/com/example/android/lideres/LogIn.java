package com.example.android.lideres;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity implements View.OnClickListener{
    Button login;
    Button singin;

    EditText matricula;

    EditText matriRegistro;
    EditText passRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        matriRegistro = (EditText) findViewById(R.id.matriculaRegistro);
        passRegistro = (EditText) findViewById(R.id.passwordRegistro);
        login = (Button) findViewById(R.id.login);
        singin = (Button) findViewById(R.id.singin);

        login.setOnClickListener(this);
        singin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        Base base = new Base();
        switch(view.getId()){
            case R.id.login:
                /*if (base.encontrar()){
                    
                }*/
                break;
            case R.id.singin:

                //System.out.print(matriRegistro.getText().toString()+" "+passRegistro.getText().toString());
                base.agregarEstudiante(matriRegistro.getText().toString(), passRegistro.getText().toString());
                Toast.makeText(getApplicationContext(), "Datos ingresados", Toast.LENGTH_SHORT).show();
                matriRegistro.setText("");
                break;
        }
    }
}
