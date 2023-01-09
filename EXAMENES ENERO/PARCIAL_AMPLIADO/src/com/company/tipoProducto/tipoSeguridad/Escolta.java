package com.company.tipoProducto.tipoSeguridad;

import com.company.clasesProporcionadas.Fecha;
import com.company.tipoProducto.Seguridad;

public class Escolta extends Seguridad {
    private int numeroHora;

    public Escolta(double coste, Fecha inicioContrato, Fecha finContrato, boolean cualificados, int numeroHora){
        super(coste, inicioContrato, finContrato, cualificados);
        this.numeroHora= numeroHora;
        cambioPrecioEscolta();
    }

    private void cambioPrecioEscolta() {

        double precio= getCoste();
        precio= precio+300;
        setCoste(precio);
    }


}
