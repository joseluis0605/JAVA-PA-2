package com.company.tipoInstrumento.tipoCuerda;


import com.company.tipoInstrumento.Cuerda;
import com.company.Tipo;

public class Piano extends Cuerda {

    public Piano(String marca, Tipo tipoInstrumento, int precioBase, int antiguedad){
        super(marca, tipoInstrumento, precioBase, antiguedad);
    }

    @Override
    public String toString() {
        return "soy un piano "+super.toString();
    }
}
