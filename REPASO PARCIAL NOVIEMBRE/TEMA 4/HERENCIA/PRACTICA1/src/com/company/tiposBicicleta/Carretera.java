package com.company.tiposBicicleta;

import com.company.Bicicleta;

public class Carretera extends Bicicleta {

    private int peso;

    public Carretera(String marca, String modelo, int precioBase, int peso){
        super(marca, modelo, precioBase);
        this.peso=peso;
        modificarPeso();
    }

    private void modificarPeso() {
        // si el peso es > 6 kilos, se suma 150
        //por ser carretera + 50
        int precio= getPrecioBase();
        precio= precio+50;
        if (peso<6){
            precio= precio+150;
        }
        setPrecioBase(precio);
    }

    public String toString(){
        return super.toString()+"peso: "+peso;
    }
}
