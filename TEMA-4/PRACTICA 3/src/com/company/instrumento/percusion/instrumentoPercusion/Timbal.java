package com.company.instrumento.percusion.instrumentoPercusion;

import com.company.TipoInstrumento;
import com.company.instrumento.percusion.Percusion;

public class Timbal extends Percusion {

    private String material;

    public Timbal(TipoInstrumento tipoInstrumento, String marca, int precio, String material){
        super(tipoInstrumento, marca, precio);
        this.material= material;
        cambioPrecio();
    }

    private void cambioPrecio() {
        int precio= getPrecio();
        if (material.equals("cobre")){
            precio=precio*107;
        }else  if (material.equals("laton")){
            precio= precio*105;
        }else {
            precio= precio*103;
        }
        setPrecio(precio/100);
    }

    public String toString(){
        return super.toString()+" soy un timbal y mi material: "+this.material;
    }
}
