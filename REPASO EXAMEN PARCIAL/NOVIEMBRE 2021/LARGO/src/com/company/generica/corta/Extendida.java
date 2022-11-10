package com.company.generica.corta;

import com.company.Fecha;
import com.company.generica.Corta;

public class Extendida extends Corta {

    private String parrafo[];
    private int indice;

    public Extendida(Fecha fecha, String resumen, String titularAsociado){
        super(fecha, resumen, titularAsociado);
        this.indice=0;
        this.parrafo= new String[10];
    }

    public void addParrafo(String parrafo){
        if (indice<this.parrafo.length){
            this.parrafo[indice]= parrafo;
            indice++;
        }
    }

    public String toString(){
        String cadena= "noticia larga de "+getTitularAsociado()+"el dia: "+getFechaPublicacion()+"\n";
        cadena= cadena+this.getResumen()+"\n";
        for (int i = 0; i < indice; i++) {
            cadena= cadena+parrafo[i]+"\n";
        }
        cadena= cadena+"************************\n";

        return cadena;
    }
}
