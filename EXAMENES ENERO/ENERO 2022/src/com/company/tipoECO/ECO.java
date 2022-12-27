package com.company.tipoECO;

import com.company.Vehiculo;

public class ECO extends Vehiculo {

    private int km;

    public ECO(String matricula, int potencia, int km){
        super(matricula, potencia);
        this.km= km;
    }

    public String toString(){
        return "vehiculo ECO "+super.toString();
    }


}
