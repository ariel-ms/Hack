package com.example.android.lideres;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button informacion;
    Button modelo;
    Button servicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        informacion = (Button) findViewById(R.id.botonInfo);
        modelo = (Button) findViewById(R.id.modelo);
        servicios = (Button) findViewById(R.id.botonPerfil);

        modelo.setOnClickListener(this);
        informacion.setOnClickListener(this);
        servicios.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.botonInfo:
                intent = new Intent(MainActivity.this,Informacion.class);
                startActivity(intent);
                break;
            case R.id.modelo:
                intent = new Intent(MainActivity.this, Modelo.class);
                startActivity(intent);
                break;
            case R.id.botonPerfil:
                intent = new Intent(MainActivity.this,Perfil.class);
                startActivity(intent);
        }
    }
}
