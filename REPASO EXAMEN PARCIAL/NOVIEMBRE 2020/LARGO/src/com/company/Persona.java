package com.company;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private int edad;

    public Persona(String nombre, String apellido, String dni, int edad){
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad= edad;
        this.dni= dni;
    }

    public String toString(){
        return "nombre y apellido "+nombre+" "+apellido+" edad: "+edad+" dni: "+dni;
    }

    public abstract boolean terminayear(int year);

    public abstract boolean esSeccion(Seccion seccion);

    public abstract boolean esCiber();

    public abstract boolean esInfor();

    public abstract boolean esSoft();

    public abstract boolean esComp();
}
