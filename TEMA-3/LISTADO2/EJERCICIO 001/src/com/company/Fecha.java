package com.company;

public class Fecha {

    private String dia;
    private String mes;
    private String year;

    public Fecha(String dia, String mes, String year){
        this.dia= dia;
        this.mes= mes;
        this.year= year;
    }

    public String toString(){
        return  dia+"/"+mes+"/"+year;
    }
}
