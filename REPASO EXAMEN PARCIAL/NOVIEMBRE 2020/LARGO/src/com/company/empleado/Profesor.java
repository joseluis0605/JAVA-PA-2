package com.company.empleado;

import com.company.Grado;
import com.company.Empleado;

public abstract class Profesor extends Empleado {

    private String departamento;

    public Profesor(String nombre, String apellido, String dni, int edad, int fechaInicio, String departamento){
        super(nombre, apellido, dni, edad, fechaInicio);
        this.departamento= departamento;
    }

    public String toString(){
        return super.toString()+" departamento: "+this.departamento;
    }
}
