package com.company;

public class Fecha {

    private int year;

    public Fecha(int year){
        this.year= year;
    }

    public String toString(){
        return "año de publicacion: "+year;
    }

    public boolean esYear(int year) {
        return this.year==year;
    }
}
