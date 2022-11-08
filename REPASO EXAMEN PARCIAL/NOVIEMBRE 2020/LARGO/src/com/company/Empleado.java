package com.company;

public abstract class Empleado extends Persona{

    private int fechaInicio;

    public Empleado(String nombre, String apellido, String dni, int edad, int fechaInicio){
        super(nombre, apellido, dni, edad);
        this.fechaInicio= fechaInicio;
    }

    public String toString(){
        return super.toString()+" fehca inicio: "+fechaInicio;
    }
}
