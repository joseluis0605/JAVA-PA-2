package com.company.tipoGenerica;

import com.company.Fecha;
import com.company.Generica;

public class Cortas extends Generica {

    private String titular;


    public Cortas(Fecha fecha, String resumen, String titular){
        super(fecha, resumen);
        this.titular= titular;
    }

    public String toString(){
        return "titular: "+this.titular+"\n"+getFecha()+" " +getResumen();
    }

    @Override
    public boolean estaPalabra(String palabra) {
        return super.estaPalabra(palabra) || this.titular.contains(palabra);
    }
}
