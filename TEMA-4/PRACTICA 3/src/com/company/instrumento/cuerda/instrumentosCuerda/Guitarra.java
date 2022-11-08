package com.company.instrumento.cuerda.instrumentosCuerda;

import com.company.TipoInstrumento;
import com.company.instrumento.cuerda.Cuerda;

public class Guitarra extends Cuerda {

    public Guitarra(TipoInstrumento tipoInstrumento, String marca, int precio, int antiguedad){
        super(tipoInstrumento, marca, precio, antiguedad);
        cambioPrecioGuitarra();
    }

    private void cambioPrecioGuitarra() {
        int precio= getPrecio();
        precio= precio*105/100;
        setPrecio(precio);
    }
}
