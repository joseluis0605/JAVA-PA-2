package com.company.tipoInstrumento.tipoCuerda;

import com.company.tipoInstrumento.Cuerda;
import com.company.Tipo;

public class Guitarra extends Cuerda {

    public Guitarra(String marca, Tipo tipoInstrumento, int precioBase, int antiguedad){
        super(marca, tipoInstrumento, precioBase, antiguedad);
        cambioGuitarra();
    }

    private void cambioGuitarra() {
        int precio= getPrecioBase();
        precio= precio*105/100;
        setPrecioBase(precio);
    }

    @Override
    public String toString() {
        return "soy una guitarra "+super.toString();
    }
}
