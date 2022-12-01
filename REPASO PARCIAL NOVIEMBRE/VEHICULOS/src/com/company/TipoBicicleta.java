package com.company;

public enum TipoBicicleta {

    URBANA("bicicleta urbana"), DEPORTIVA("bicicleta deportiva");

    private String tipo;

    TipoBicicleta(String tipo){
        this.tipo=tipo;
    }

    public String toString(){
        return tipo;
    }
}
