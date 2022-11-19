package com.company.tiposBicicleta;

import com.company.Bicicleta;

public class Montana extends Bicicleta {

    private boolean amortiguadores;

    public Montana(String marca, String modelo, int precioBase, boolean amortiguadores){
        super(marca, modelo, precioBase);
        this.amortiguadores= amortiguadores;
        cambioPrecio();
    }

    private void cambioPrecio() {
        int precio= getPrecioBase();
        if (amortiguadores){
            precio= precio+60;
        }
        setPrecioBase(precio);
    }

    public String toString(){
        return super.toString()+"amortiguadores: "+amortiguadores;
    }



}
