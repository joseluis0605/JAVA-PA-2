package com.company.tipoVehiculo;

import com.company.Vehiculo;

public class Coche extends Vehiculo {

    private int velocidad;
    private int cilindrada;

    public Coche(String color, int ruedas, int velocidad, int cilindrada){
        super(color, ruedas);
        this.velocidad= velocidad;
        this.cilindrada= cilindrada;
    }

    public String toString(){
        return super.toString()+" velocidad: "+velocidad+" cilindradas: "+cilindrada;
    }
}
