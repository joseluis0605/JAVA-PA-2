package com.company.empleado.profesor;

import com.company.Grado;
import com.company.Seccion;
import com.company.empleado.Profesor;

public class Laboral extends Profesor {

    private int fechaFin;

    public Laboral(String nombre, String apellido, String dni, int edad, int fechaInicio, String departamento, int fechaFin){
        super(nombre, apellido, dni, edad, fechaInicio, departamento);
        this.fechaFin= fechaFin;
    }

    public String toString(){
        return super.toString()+" fecha fin: "+fechaFin;
    }

    @Override
    public boolean terminayear(int year) {
        return this.fechaFin==year;
    }

    @Override
    public boolean esSeccion(Seccion seccion) {
        return false;
    }

    @Override
    public boolean esCiber() {
        return false;
    }

    @Override
    public boolean esInfor() {
        return false;
    }

    @Override
    public boolean esSoft() {
        return false;
    }

    @Override
    public boolean esComp() {
        return false;
    }
}
