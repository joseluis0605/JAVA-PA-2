package com.company.tipoPersona;

import com.company.Fecha;
import com.company.Persona;

public abstract class Empleado extends Persona {

    private Fecha fechaInicio;

    public Empleado(String nombre, String apellido, String dni, int edad, Fecha fechaInicio){
        super(nombre, apellido, dni, edad);
        this.fechaInicio=fechaInicio;
    }

    @Override
    public String toString() {
        return super.toString()+" "+fechaInicio+" ";
    }
}
