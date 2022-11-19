package com.company.tipoInstrumento;

import com.company.Instrumento;
import com.company.Tipo;

public abstract class Viento extends Instrumento {

    public Viento(String marca, Tipo tipoInstrumento, int precioBase){
        super(marca, tipoInstrumento, precioBase);
        cambioViento();
    }

    private void cambioViento() {
        String marca= getMarca();
        int precio= getPrecioBase();
        if (esMarca(marca)){
            precio= precio*102/100;
        }else {
            precio= precio*110/100;
        }
        setPrecioBase(precio);
    }

    private boolean esMarca(String marca) {
        return marca.equalsIgnoreCase("HOLTON")|| marca.equalsIgnoreCase("BESSON") || marca.equalsIgnoreCase("AMATI");
    }

    @Override
    public boolean esViento() {
        return true;
    }
}
