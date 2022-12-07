package com.company;

public class Persona {

    private String nombre;
    private String matricula;

    public Persona(String nombre, String matricula){
        this.matricula= matricula;
        this.nombre= nombre;
    }

    public String toString(){
        return "nombre: "+nombre+" matricula: "+matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }
}
