package com.example.android.lideres;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Perfil extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Button servicios;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        //servicios = (Button) findViewById(R.id.botonServicios);
        spinner = (Spinner) findViewById(R.id.niveles);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.levelarray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        //servicios.setOnClickListener(this);
        spinner.setOnItemSelectedListener(this);
    }

    /*@Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.botonServicios:
                intent = new Intent(Perfil.this,Nivel.class);
                startActivity(intent);
                break;
        }
    }*/

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent;
        if(adapterView.getItemAtPosition(i).equals("Nivel 1")){
            intent = new Intent(Perfil.this,Nivel.class);
            startActivity(intent);
        }else if (adapterView.getItemAtPosition(i).equals("Nivel 2")){
            intent = new Intent(Perfil.this,Nivel2.class);
            startActivity(intent);
        }else if (adapterView.getItemAtPosition(i).equals("Nivel 3")){
            intent = new Intent(Perfil.this,Nivel3.class);
            startActivity(intent);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
