package com.company.instrumento.viento.instrumentosViento;

import com.company.TipoInstrumento;
import com.company.instrumento.viento.Viento;

public class Oboe extends Viento {

    public Oboe(TipoInstrumento tipoInstrumento, String marca, int precio){
        super(tipoInstrumento, marca, precio);
    }

    public String toString(){
        return super.toString()+" soy un oboe";
    }
}
