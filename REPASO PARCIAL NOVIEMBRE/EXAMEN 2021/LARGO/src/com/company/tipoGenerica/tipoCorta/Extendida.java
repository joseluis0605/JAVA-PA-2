package com.company.tipoGenerica.tipoCorta;

import com.company.Fecha;
import com.company.tipoGenerica.Cortas;

public class Extendida extends Cortas {

    private Parrafo listado[];
    private int numeroParrafo;

    public Extendida(Fecha fecha, String resumen, String titular){
        super(fecha, resumen, titular);
        this.listado= new Parrafo[10];
        this.numeroParrafo=0;
    }

    public void addParrafo(Parrafo parrafo){
        if (numeroParrafo< listado.length){
            listado[numeroParrafo]=parrafo;
            numeroParrafo++;
        }
    }

    public String toString(){
        String cadena="";
        for (int i = 0; i < numeroParrafo; i++) {
            cadena= cadena+listado[i].getParrafo();
        }
        return "noticia extendida\n"+cadena;
    }

    @Override
    public boolean estaPalabra(String palabra) {

        boolean esta= false;
        for (int i = 0; i < numeroParrafo; i++) {
            if (listado[i].contiene(palabra)){
                esta= true;
            }
        }
        return super.estaPalabra(palabra) || esta;
    }

}
