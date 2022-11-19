package com.company.tipoInstrumento.tipoPercusion;

import com.company.Tipo;
import com.company.tipoInstrumento.Percusion;

public class Timbales extends Percusion {

    private String material;

    public Timbales(String marca, Tipo tipoInstrumento, int precioBase, String material){
        super(marca, tipoInstrumento, precioBase);
        this.material=material;
        cambioTimbales();
    }

    private void cambioTimbales() {
        int precio= getPrecioBase();
        if (material.equalsIgnoreCase("COBRE")){
            precio=precio*107/100;
        }else if (material.equalsIgnoreCase("LATON")){
            precio= precio*105/100;
        }else {
            precio= precio*103/100;
        }
        setPrecioBase(precio);
    }

    @Override
    public String toString() {
        return "soy un timbal "+super.toString()+" y estoy hecho de "+material;
    }
}
