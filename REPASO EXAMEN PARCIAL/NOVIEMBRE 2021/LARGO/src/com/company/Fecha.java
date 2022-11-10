package com.company;

public class Fecha {

    private int dia;
    private int mes;
    private int year;

    public Fecha (int dia, int mes, int year){
        this.dia= dia;
        this.mes= mes;
        this.year= year;
    }

    public String toString(){
        return dia+"/"+mes+"/"+year;
    }

    public boolean esMismaFecha(Fecha fecha) {
        return this.year== fecha.year;
    }
}
