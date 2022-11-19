package com.company.tipoInstrumento.tipoPercusion.tipoBateria;

import com.company.tipoInstrumento.tipoPercusion.Bateria;
import com.company.Tipo;

public class Acustica extends Bateria {

    private int numeroTambores;
    private int numeroPlatillo;

    public Acustica(String marca, Tipo tipoInstrumento, int precioBase, int numeroTambores, int numeroPlatillo){
        super(marca, tipoInstrumento, precioBase);
        this.numeroPlatillo= numeroPlatillo;
        this.numeroTambores= numeroTambores;
        cambioAcustica();
    }

    private void cambioAcustica() {
        int precio= getPrecioBase();
        precio= precio*115/100;
        if (numeroTambores>6){
            precio= precio*105/100;
        }
        if (numeroPlatillo>5){
            precio= precio*102/100;
        }
        setPrecioBase(precio);
    }

    @Override
    public String toString() {
        return "soy una bateria acustica "+super.toString()+" y tengo platillos "+numeroPlatillo+" y tengo tambores: "+numeroTambores;
    }
}
