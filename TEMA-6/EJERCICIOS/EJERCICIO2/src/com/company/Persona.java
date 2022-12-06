package com.company;

import java.util.Objects;

public class Persona {

    private String nombre;
    private int edad;
    private int notaMedia;

    public Persona(String nombre, int edad, int notaMedia){
        this.nombre=nombre;
        this.edad=edad;
        this.notaMedia=notaMedia;
    }

    @Override
    public String toString() {
        return nombre+" "+edad+" años "+notaMedia;
    }


    //una persona va a ser igual por su nombre
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNotaMedia() {
        return notaMedia;
    }
}
