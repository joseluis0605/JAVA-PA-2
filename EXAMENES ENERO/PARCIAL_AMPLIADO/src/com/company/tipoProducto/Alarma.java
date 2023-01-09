package com.company.tipoProducto;

import com.company.clasesProporcionadas.Fecha;
import com.company.clasesProporcionadas.ProductoSeguridad;

public class Alarma extends ProductoSeguridad {

    private int numeroCamaras;

    public Alarma(Fecha inicioContrato, Fecha finContrato, int numeroCamaras){
        super(50, inicioContrato, finContrato);
        this.numeroCamaras= numeroCamaras;
        cambioPrecioAlarma();
    }

    private void cambioPrecioAlarma() {
        double precio= getCoste();
        if (numeroCamaras>5){
            int camaras= numeroCamaras-5;
            double valor= camaras*20;
            precio= precio+valor;
            setCoste(precio);
        }
    }

}
