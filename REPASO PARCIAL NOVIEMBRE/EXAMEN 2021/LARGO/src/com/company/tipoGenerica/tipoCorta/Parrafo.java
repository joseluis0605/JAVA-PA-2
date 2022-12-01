package com.company.tipoGenerica.tipoCorta;

public class Parrafo {

    private String parrafo;

    public Parrafo(String parrafo){
        this.parrafo= parrafo;
    }

    @Override
    public String toString() {
        return parrafo;
    }

    public String getParrafo() {
        return parrafo+"\n";
    }

    public boolean contiene(String palabra) {
        return this.parrafo.contains(palabra);
    }
}
