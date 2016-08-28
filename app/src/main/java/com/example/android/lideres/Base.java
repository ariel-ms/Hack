package com.example.android.lideres;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ariel on 28/08/2016.
 */
public class Base {
    private Map<String,Estudiante> base = new HashMap<String,Estudiante>();;
    private boolean state;
    private Estudiante est;
    private String matricula;
    private String password;

    public void Base(){
        state = false;
        matricula = null;
        password = null;
    }

    public void agregarEstudiante(String matricula, String password){
        //base = new HashMap<String,Estudiante>();
        est = new Estudiante();
        est.setMatricula(matricula.toLowerCase());
        est.setPassword(password);
        base.put(matricula.toLowerCase(),est);
    }

    public HashMap<String,Estudiante> getData(){
        return (HashMap<String, Estudiante>) ((HashMap)base).clone();
    }

    public void setData(HashMap<String,Estudiante> data){
        this.base = data;
    }

    public boolean encontrar(String matricula, String contraseña){
        return (base.containsValue(matricula.toLowerCase())) && (base.get(matricula.toLowerCase()).getPassword().equals(contraseña));
    }

}
