package com.company.tipoProducto.tipoPersonalSeguridad;

import com.company.Fecha;
import com.company.tipoProducto.PersonalSeguridad;

public class Escolta extends PersonalSeguridad {

    private int horas;

    public Escolta(double coste, Fecha inicioContrato, Fecha finContrato, boolean cualificados, int horas){
        super(coste, inicioContrato, finContrato, cualificados);
        this.horas=horas;
        cambioPrecio();
    }

    private void cambioPrecio() {
        double precio= getCoste();
        if (isCualificados()){
            precio= precio+300;
        }
        setCoste(300);
    }

    public String toString(){
        return super.toString()+" horas: "+horas;
    }
}
