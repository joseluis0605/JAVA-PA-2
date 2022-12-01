package com.company;

import jdk.jfr.DataAmount;

public class Fecha {

    private int dia;
    private int mes;
    private int year;

    public Fecha(int dia, int mes, int year){
        this.dia= dia;
        this.mes= mes;
        this.year=year;
    }

    public String toString(){
        return dia+"/"+mes+"/"+year;
    }

    public boolean misma(Fecha fecha) {
        return this.dia== fecha.dia && this.mes== fecha.mes && this.year== fecha.year;
    }
}
