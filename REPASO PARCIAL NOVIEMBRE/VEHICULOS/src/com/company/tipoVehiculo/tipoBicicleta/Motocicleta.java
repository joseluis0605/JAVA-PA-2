package com.company.tipoVehiculo.tipoBicicleta;

import com.company.TipoBicicleta;
import com.company.tipoVehiculo.Bicicleta;

public class Motocicleta extends Bicicleta {

    private int velocidad;
    private int cilindrada;

    public Motocicleta(String color, int ruedas, TipoBicicleta tipoBicicleta, int velocidad, int cilindrada){
        super(color, ruedas, tipoBicicleta);
        this.velocidad=velocidad;
        this.cilindrada= cilindrada;
    }

    public String toString(){
        return super.toString()+" velocidad: "+velocidad+" cilindrada: "+cilindrada;
    }
}
