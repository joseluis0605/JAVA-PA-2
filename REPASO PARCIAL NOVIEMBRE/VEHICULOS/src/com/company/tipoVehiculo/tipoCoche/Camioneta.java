package com.company.tipoVehiculo.tipoCoche;

import com.company.tipoVehiculo.Coche;

public class Camioneta extends Coche {

    private int carga;

    public Camioneta(String color, int ruedas, int velocidad, int cilindrada, int carga){
        super(color, ruedas, velocidad, cilindrada);
        this.carga= carga;
    }

    public String toString(){
        return super.toString()+" carga: "+carga;
    }

    @Override
    public boolean esCamioneta() {
        return true;
    }
}
