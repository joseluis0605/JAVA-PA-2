package com.company.tipoProducto.tipoPersonalSeguridad;

import com.company.Fecha;
import com.company.tipoProducto.PersonalSeguridad;

public class Vigilante extends PersonalSeguridad {

    private int jornadas;

    public Vigilante(double coste, Fecha inicioContrato, Fecha finContrato, boolean cualificados, int jornadas){
        super(coste, inicioContrato, finContrato, cualificados);
        this.jornadas= jornadas;
    }

    public String toString(){
        return super.toString()+" jornadas: "+jornadas;
    }
}
