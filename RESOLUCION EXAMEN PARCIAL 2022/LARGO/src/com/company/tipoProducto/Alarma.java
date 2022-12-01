package com.company.tipoProducto;

import com.company.Fecha;
import com.company.ProductoSeguridad;

public class Alarma extends ProductoSeguridad {

    private  int numeroCamaras;

    public Alarma(double coste, Fecha inicioContrato, Fecha finContrato, int numeroCamaras){
        super(coste, inicioContrato, finContrato);
        this.numeroCamaras= numeroCamaras;
        setCoste(50);
        cambioPrecio();
    }

    private void cambioPrecio() {

        double precio= getCoste();
        if (numeroCamaras>5){
            precio= precio+20;
        }
        setCoste(precio);
    }

    public String toString(){
        return  super.toString()+" numero camaras "+numeroCamaras;
    }
}
