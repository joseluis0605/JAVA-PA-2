package com.company.tipoInstrumento;

import com.company.Instrumento;
import com.company.Tipo;

public abstract class Percusion extends Instrumento {

    public Percusion(String marca, Tipo tipoInstrumento, int precioBase){
        super(marca, tipoInstrumento, precioBase);
    }
}
