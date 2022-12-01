package com.company.tipoPersona;

import com.company.Persona;

public class Estudiante extends Persona {

    private Grado grado;

    public Estudiante(String nombre, String apellido, String dni, int edad, Grado grado){
        super(nombre, apellido, dni, edad);
        this.grado= grado;
    }

    public String toString(){
        return super.toString()+" grado: "+grado;
    }

    @Override
    public boolean eresCiber() {
        return grado.equals(Grado.CIBERSEGURIDAD);
    }

    @Override
    public boolean soft() {
        return grado.equals(Grado.SOFTWARE);
    }

    @Override
    public boolean comp() {
        return grado.equals(Grado.COMPUTADORES);
    }

    @Override
    public boolean infor() {
        return grado.equals(Grado.INFORMATICA);
    }

    @Override
    public boolean videogame() {
        return grado.equals(Grado.VIDEOJUEGOS);
    }
}

