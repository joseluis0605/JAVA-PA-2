package com.company.tipoVehiculo;

import com.company.Vehiculo;
import com.company.TipoBicicleta;

public class Bicicleta extends Vehiculo {

    private TipoBicicleta tipoBicicleta;

    public Bicicleta (String color, int ruedas, TipoBicicleta tipoBicicleta){
        super(color, ruedas);
        this.tipoBicicleta= tipoBicicleta;
    }

    @Override
    public String toString() {
        return super.toString()+" bicicleta: "+this.tipoBicicleta;
    }
}
