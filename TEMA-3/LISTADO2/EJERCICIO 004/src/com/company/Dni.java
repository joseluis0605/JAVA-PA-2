package com.company;

public class Dni {

    private int numero;
    private String letra;

    public Dni (int numero, String letra){
        this.numero= numero;
        this.letra= letra;
    }

    public String toString(){
        return this.numero+this.letra;

    }

    public boolean mismoDni(Dni dni) {
        return this.numero==dni.numero && this.letra.equals(dni.letra);
    }
}
