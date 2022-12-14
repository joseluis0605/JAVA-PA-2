package com.company.tipoContenido.tipoSerie;

public class Capitulo {

    int tiempoCapitulo;

    public Capitulo(int tiempoCapitulo){
        this.tiempoCapitulo= tiempoCapitulo;
    }

    public String toString(){
        return String.valueOf(tiempoCapitulo);
    }

    public int getTiempoCapitulo() {
        return tiempoCapitulo;
    }
}
