package com.company.empleado;

import com.company.Empleado;
import com.company.Seccion;

public class Asalariado extends Empleado {

    private int fechaFin;

    public Asalariado(String nombre, String apellido, String dni, int edad,int fechaInicio,  int fechaFin){
        super(nombre, apellido, dni, edad, fechaInicio);
        this.fechaFin= fechaFin;
    }

    public String toString(){
        return super.toString()+" fecha fin: "+fechaFin;
    }

    @Override
    public boolean terminayear(int year) {
        return fechaFin==year;
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
