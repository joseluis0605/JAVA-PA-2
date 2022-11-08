package com.company.instrumento.percusion.instrumentoPercusion.bateria;

import com.company.TipoInstrumento;
import com.company.instrumento.percusion.instrumentoPercusion.Bateria;

import java.util.Base64;

public class Acustica extends Bateria {

    private int tambores;
    private int platillos;

    public Acustica(TipoInstrumento tipoInstrumento, String marca, int precio, int tambores, int platillos){
        super(tipoInstrumento, marca, precio);
        this.tambores=tambores;
        this.platillos= platillos;
        cambioPrecioBateria();
    }

    private void cambioPrecioBateria() {
        int precio= getPrecio();
        precio= precio*115/100;
        if (this.tambores>6){
            precio= precio*105/100;
            if (this.platillos>5){
                precio= precio*102/100;
            }
        }
        setPrecio(precio);
    }

    public String toString(){
        return super.toString()+" soy una bateria acustica tambores: "+this.tambores+" platillos: "+this.platillos;
    }
}
