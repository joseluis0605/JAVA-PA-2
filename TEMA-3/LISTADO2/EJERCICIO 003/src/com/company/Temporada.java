package com.company;

public class Temporada {

    private int idTemporada;
    private int year;
    private int numeroCapitulos;
    private Capitulo listadoC[];

    public Temporada(int idTemporada, int year, int max){
        this.idTemporada= idTemporada;
        this.year= year;
        this.numeroCapitulos=0;
        this.listadoC= new Capitulo[max];
    }

    public void addCapitulo(Capitulo capitulo){
        if (numeroCapitulos< listadoC.length){
            this.listadoC[numeroCapitulos]= capitulo;
            numeroCapitulos++;
        }
    }


    public void mostrarTemporada() {
        for (int i = 0; i < numeroCapitulos; i++) {
            System.out.println("capitulo "+ (i+1));
            System.out.println(listadoC[i]);
        }
    }

    public boolean masCapitulos(int numeroCapitulosMax) {
        return this.numeroCapitulos>numeroCapitulosMax;
    }

    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    public int media() {
        int aux= 0;
        for (int i = 0; i < numeroCapitulos; i++) {
            aux= aux + listadoC[i].getDuracionMedia();
        }
        aux= aux/numeroCapitulos;
        return aux;
    }
}
