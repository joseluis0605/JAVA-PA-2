package com.company;

public abstract class Vehiculo {

    private String color;
    private int ruedas;

    public Vehiculo(String color, int ruedas){
        this.color= color;
        this.ruedas= ruedas;
    }

    public String toString(){
        return "color: "+color+" ruedas: "+ruedas;
    }

    public boolean coincideRueda(int numero) {
        return this.ruedas==numero;
    }

    public boolean esCamioneta() {
        return false;
    }
}
