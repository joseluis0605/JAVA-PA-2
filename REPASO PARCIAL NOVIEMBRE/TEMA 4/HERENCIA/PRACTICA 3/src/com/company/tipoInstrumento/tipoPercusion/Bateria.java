package com.company.tipoInstrumento.tipoPercusion;

import com.company.Tipo;
import com.company.tipoInstrumento.Percusion;

public abstract class Bateria extends Percusion {

    public Bateria(String marca, Tipo tipoInstrumento, int precioBase){
        super(marca, tipoInstrumento, precioBase);
    }
}
