package com.company.tipoPersona.tipoEmpleado;

import com.company.Fecha;
import com.company.tipoPersona.Empleado;

public class Admin extends Empleado {

    private String seccion;

    public Admin(String nombre, String apellido, String dni, int edad, Fecha fechaInicio, String seccion ){
        super(nombre, apellido, dni, edad, fechaInicio);
        this.seccion= seccion;
    }

    public String toString(){
        return super.toString()+" seccion: "+seccion;
    }

    @Override
    public boolean esSeccion(String seccion) {
        return this.seccion.equals(seccion);
    }
}
