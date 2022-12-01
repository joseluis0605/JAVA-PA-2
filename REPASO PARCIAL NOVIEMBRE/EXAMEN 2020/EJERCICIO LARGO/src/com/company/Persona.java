package com.company;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private int edad;

    public Persona(String nombre, String apellido, String dni, int edad){
        this.nombre=nombre;
        this.apellido= apellido;
        this.dni= dni;
        this.edad= edad;
    }

    public String toString(){
        return "nombre "+nombre+" apellido "+apellido+" dni "+dni+" edad: "+edad+" ";
    }

    public boolean terminan(int year) {
        return false;
    }

    public boolean eresCiber() {
        return false;
    }

    public boolean infor() {
        return false;
    }

    public boolean comp() {
        return false;
    }

    public boolean soft() {
        return false;
    }

    public boolean videogame() {
        return false;
    }

    public boolean esSeccion(String seccion) {
        return false;
    }
}
