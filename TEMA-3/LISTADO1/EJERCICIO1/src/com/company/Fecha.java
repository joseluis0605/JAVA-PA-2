package com.company;

public class Fecha {

    private int dia;
    private int mes;
    private int year;

    public Fecha(int dia, int mes, int year){
        this.dia= dia;
        this.mes= mes;
        this.year= year;
    }


    public boolean esPosterior(Fecha fecha) {
        if (this.mes> fecha.mes){
            return true;
        }else if (this.mes== fecha.mes){
            if (this.dia>= fecha.dia){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
