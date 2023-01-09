package com.company.tipoProducto.tipoSeguridad;

import com.company.clasesProporcionadas.Fecha;
import com.company.tipoProducto.Seguridad;

public class Vigilante extends Seguridad {

    private int jornada;

    public Vigilante(double coste, Fecha inicioContrato, Fecha finContrato, boolean cualificados, int jornada){
        super(coste, inicioContrato, finContrato, cualificados);
        this.jornada=jornada;
    }
}
