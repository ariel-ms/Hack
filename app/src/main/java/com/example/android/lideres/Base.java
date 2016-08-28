package com.example.android.lideres;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ariel on 28/08/2016.
 */
public class Base {
    private Map<String,Estudiante> base;
    private boolean state;
    private Estudiante est;
    private String matricula;
    private String password;

    public void Base(){
        base = new HashMap<String,Estudiante>();
        state = false;
        matricula = null;
        password = null;
        est = null;
    }

    public void agregarEstudiante(String matricula, String password){
        est = new Estudiante();
        est.setMatricula(matricula.toLowerCase());
        est.setPassword(password);
        base.put(matricula.toLowerCase(),est);
        /*String matri = estudiante.getMatricula();
        matri = matri.toLowerCase();
        base.put(matri,)*/
    }


}
