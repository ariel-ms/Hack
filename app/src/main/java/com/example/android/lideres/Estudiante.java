package com.example.android.lideres;

/**
 * Created by Ariel on 28/08/2016.
 */
public class Estudiante {

    private String matricula;
    private String password;
    private int nivel;
    //private Map<String,Estudiante> base;

    public Estudiante(){
        matricula = null;
        password = null;
        nivel = 0;
        //base = new HashMap<String,Estudiante>();
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public String getMatricula(){
        return matricula;
    }

    public String getPassword(){
        return password;
    }

    public int getNivel(){
        return nivel;
    }

    /*public void agregarEstudiante(){
        String matri = getMatricula();
        matri = matri.toLowerCase();
        base.put(matri,)
    }*/
}
