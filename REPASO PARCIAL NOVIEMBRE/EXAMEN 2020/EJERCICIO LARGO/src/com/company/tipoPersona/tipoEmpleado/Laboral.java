package com.company.tipoPersona.tipoEmpleado;

import com.company.Fecha;

public class Laboral extends Profesor {

    private Fecha fechaFin;

    public Laboral(String nombre, String apellido, String dni, int edad, Fecha fechaInicio, String departamento, Fecha fecha){
        super(nombre, apellido, dni, edad, fechaInicio, departamento);
        this.fechaFin= fecha;
    }

    public String toString(){
        return super.toString()+" fecha fin "+this.fechaFin;
    }

    @Override
    public boolean terminan(int year) {
        return fechaFin.coincide(year);
    }
}
