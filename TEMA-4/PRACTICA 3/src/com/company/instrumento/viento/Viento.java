package com.company.instrumento.viento;

import com.company.Instrumento;
import com.company.TipoInstrumento;

public class Viento extends Instrumento {

    public Viento(TipoInstrumento tipoInstrumento, String marca, int precio){
        super(tipoInstrumento, marca, precio);
        modificarPrecio();
    }

    private void modificarPrecio() {
        int precio= getPrecio();
        String marca= getMarca();
        if (marca.equals("AMATI") || marca.equals("HOLTON") || marca.equals("BESSON")){
            precio= precio*110;
        }
        precio= precio*102;
        setPrecio(precio/100);
    }

}

