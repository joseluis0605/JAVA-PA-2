package com.company.tipoInstrumento.tipoViento;

import com.company.Tipo;
import com.company.tipoInstrumento.Viento;

public class Oboe extends Viento {

    public Oboe (String marca, Tipo tipoInstrumento, int precioBase){
        super(marca, tipoInstrumento, precioBase);
    }

    @Override
    public String toString() {
        return "soy un oboe "+ super.toString();
    }
}
