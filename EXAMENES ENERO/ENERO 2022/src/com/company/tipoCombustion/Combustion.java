package com.company.tipoCombustion;

import com.company.Vehiculo;
import com.company.tipoCombustion.tipoCombustion;

public class Combustion extends Vehiculo {

    private tipoCombustion tipoCombustion;
    public Combustion(String matricula, int potencia, tipoCombustion tipoCombustion){
        super(matricula, potencia);
        this.tipoCombustion= tipoCombustion;
        changeDinero();
    }

    public String toString(){
        return "COMBUSTION: "+super.toString();
    }

    @Override
    public void changeDinero() {
        super.changeDinero();
        int precio= getPrecio();
        if (tipoCombustion.equals(com.company.tipoCombustion.tipoCombustion.DIESEL)){
            precio= precio+10;
        }
        setPrecio(precio);
    }
}
