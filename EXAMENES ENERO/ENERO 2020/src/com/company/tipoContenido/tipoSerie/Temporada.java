package com.company.tipoContenido.tipoSerie;

import com.company.tipoContenido.tipoSerie.Capitulo;

import java.util.ArrayList;

public class Temporada {

    private ArrayList<Capitulo> listaCapitulo;
    private int idTemporada;

    public Temporada(int idTemporada){
        this.idTemporada= idTemporada;
        this.listaCapitulo= new ArrayList<>();
    }

    public String toString(){
        return "temporada ---> "+idTemporada+" "+listaCapitulo;
    }

    public int duracionTemporada(){
        int contador=0;
        for (Capitulo capitulo: listaCapitulo){
            contador=contador+capitulo.getTiempoCapitulo();
        }
        return contador;
    }

    public void addCapitulo(Capitulo capitulo){
        listaCapitulo.add(capitulo);

    }

}
