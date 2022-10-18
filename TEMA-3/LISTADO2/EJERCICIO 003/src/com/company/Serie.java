package com.company;

public class Serie {

    private String nombre;
    private int numeroTemporadas;
    private Temporada listadoT[];

    public Serie (String nombre, int max){
        this.nombre= nombre;
        this.listadoT= new Temporada[max];
        this.numeroTemporadas=0;
    }
}
