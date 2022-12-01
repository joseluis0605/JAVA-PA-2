package com.company;

public class Fecha {

    private int year;

    public Fecha( int year){
        this.year= year;
    }

    @Override
    public String toString() {
        return "Fecha inicio contrato: "+year;
    }

    public boolean coincide(int year) {
        return year==this.year;
    }
}
