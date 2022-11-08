package com.company.empleado;

import com.company.Empleado;
import com.company.Seccion;

public class AdminServicio extends Empleado {

    private Seccion seccion;

    public AdminServicio(String nombre, String apellido, String dni, int edad, int fechaInicio, Seccion seccion){
        super( nombre, apellido, dni, edad, fechaInicio);
        this.seccion=seccion;
    }

    public String toString(){
        return super.toString()+" seccion: "+this.seccion;
    }

    @Override
    public boolean terminayear(int year) {
        return false;
    }

    @Override
    public boolean esSeccion(Seccion seccion) {
        return seccion.equals(this.seccion);
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
