package com.company;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre= nombre;
        this.apellido= apellido;
    }

    public String toString(){
        return this.nombre+" "+this.apellido;
    }

    public boolean esAutor(Persona persona) {
        return this.nombre.equals(persona.nombre) && this.apellido.equals(persona.apellido);
    }
}
