package com.company.generica;

import com.company.Fecha;
import com.company.GenericaNoticia;

public class Corta extends GenericaNoticia {

    private String titularAsociado;

    public Corta(Fecha fecha, String resumen, String titularAsociado){
        super(fecha, resumen);
        this.titularAsociado= titularAsociado;
    }

    public String toString(){
        String cadena= "noticia corta de "+this.titularAsociado+"el dia: "+getFechaPublicacion()+"\n";
        cadena= cadena+this.getResumen()+"\n";
        cadena= cadena+"************************\n";

        return cadena;
    }

    protected String getTitularAsociado() {
        return titularAsociado;
    }
}
