package com.company;

public class Fecha {

    private int dia;
    private int mes;
    private int year;

    public Fecha(int dia, int mes, int year){
        this.year=year;
        this.mes=mes;
        this.dia= dia;
    }

    public String toString(){
        return dia+"/"+mes+"/"+year;
    }

    public boolean misma(Fecha fecha) {
        return this.year== fecha.year;
    }
}
