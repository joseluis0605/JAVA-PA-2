package com.company.empleado.profesor;

import com.company.Grado;
import com.company.Seccion;
import com.company.empleado.Profesor;

public class Titular extends Profesor {

    public Titular(String nombre, String apellido, String dni, int edad, int fechaInicio, String departamento){
        super(nombre, apellido, dni, edad, fechaInicio, departamento);
    }

    @Override
    public boolean terminayear(int year) {
        return false;
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
