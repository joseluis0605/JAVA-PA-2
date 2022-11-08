package com.company.instrumento.percusion.instrumentoPercusion.bateria;

import com.company.TipoInstrumento;
import com.company.instrumento.percusion.instrumentoPercusion.Bateria;


public class Electrica extends Bateria {

    public Electrica(TipoInstrumento tipoInstrumento, String marca, int precio){
        super(tipoInstrumento, marca, precio);
        cambioPrecio();
    }

    private void cambioPrecio() {
        int precio= getPrecio();
        precio= precio*101/100;
        setPrecio(precio);
    }

    public String toString(){
        return super.toString()+" soy una bateria electrica";
    }
}
