package com.company;

import java.util.Objects;

public class Persona {

    private String nombre;
    private String apellido;
    private int expediente;

    public Persona(String nombre, String apellido, int expediente){
        this.nombre=nombre;
        this.apellido=apellido;
        this.expediente= expediente;
    }

    public String toString(){
        return nombre+" "+apellido+" "+expediente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return expediente == persona.expediente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(expediente);
    }

    public String getNombre() {
        return nombre;
    }

    public int getExpediente() {
        return expediente;
    }

    public String getApellido() {
        return apellido;
    }

}

