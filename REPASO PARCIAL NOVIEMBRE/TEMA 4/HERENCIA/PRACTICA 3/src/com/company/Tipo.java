package com.company;

public enum Tipo {

    VIENTO("instrumento de viento"), CUERDA("instrumento de cuerda"), PERCUSION("instrumento de percusion");

    private String tipo;

    Tipo(String tipo){
        this.tipo= tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
