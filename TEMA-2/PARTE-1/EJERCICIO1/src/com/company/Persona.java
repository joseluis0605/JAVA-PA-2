package com.company;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private int edad;

    public Persona(String nombre, String apellido, String dni, int edad){
        this.nombre= nombre;
        this.apellido= apellido;
        this.dni=dni;
        this.edad= edad;
    }

    public String toString(){
        return "nombre: "+nombre+" "+apellido+" dni: "+dni+" edad: "+edad;
    }

    public boolean esTocaya(Persona persona){
        return this.nombre.equals(persona.nombre);
    }

    public boolean esMenor25 (){
        return this.edad<25;
    }

    public boolean mismaPersona(Persona persona){
        return this.dni.equals(persona.dni);
    }

    public static void main(String[] args) {
        
    }
}


