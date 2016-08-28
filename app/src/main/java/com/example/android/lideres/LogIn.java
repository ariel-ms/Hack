package com.example.android.lideres;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class LogIn extends AppCompatActivity implements View.OnClickListener{
    Button login;
    Button singin;

    EditText matriculaInicio;
    EditText passwordInicio;

    EditText matriRegistro;
    EditText passRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        matriRegistro = (EditText) findViewById(R.id.matriculaRegistro);
        passRegistro = (EditText) findViewById(R.id.passwordRegistro);
        matriculaInicio = (EditText) findViewById(R.id.matriculaInicio);
        passwordInicio = (EditText) findViewById(R.id.passwordInicio);

        login = (Button) findViewById(R.id.login);
        singin = (Button) findViewById(R.id.singin);

        login.setOnClickListener(this);
        singin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        HashMap<String, Estudiante> data = new HashMap<String, Estudiante>();
        Base base;
        switch(view.getId()){
            case R.id.login:

                /*base2.setData(data);
                if(data.isEmpty()==true){
                    Toast.makeText(getApplicationContext(),"No hay datos", Toast.LENGTH_SHORT).show();
                }*/
                base = new Base();
                //base.setData(data);
                if (base.encontrar(matriculaInicio.getText().toString(),passwordInicio.getText().toString())){
                    intent = new Intent(LogIn.this,Perfil.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Usuario no registrado", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.singin:
                base = new Base();
                //System.out.print(matriRegistro.getText().toString()+" "+passRegistro.getText().toString());
                base.agregarEstudiante(matriRegistro.getText().toString(), passRegistro.getText().toString());
                data = base.getData();
                Toast.makeText(getApplicationContext(), "Datos ingresados", Toast.LENGTH_SHORT).show();
                matriRegistro.setText("");
                passRegistro.setText("");
                break;
        }
    }

    private void setData(){

    }
}
