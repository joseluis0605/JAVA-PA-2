package com.company.tipoInstrumento.tipoPercusion.tipoBateria;

import com.company.tipoInstrumento.tipoPercusion.Bateria;
import com.company.Tipo;

public class Electrica extends Bateria {

    public Electrica(String marca, Tipo tipoInstrumento, int precioBase){
        super(marca, tipoInstrumento, precioBase);
    }

    public String toString(){
        return "soy una bateria electrica "+super.toString();
    }
}
