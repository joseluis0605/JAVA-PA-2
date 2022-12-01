package com.company.tipoPersona.tipoEmpleado;

import com.company.Fecha;
import com.company.tipoPersona.Empleado;

public abstract class Profesor extends Empleado {

    private String departamento;

    public Profesor(String nombre, String apellido, String dni, int edad, Fecha fechaInicio, String departamento){
        super(nombre, apellido, dni, edad, fechaInicio);
        this.departamento= departamento;
    }

    public String toString(){
        return super.toString()+" departamento "+departamento;
    }
}
