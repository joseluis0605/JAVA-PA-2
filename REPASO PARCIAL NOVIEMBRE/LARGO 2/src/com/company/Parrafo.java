package com.company;

public class Parrafo {

    private String parrafo;

    public Parrafo(String parrafo){
        this.parrafo=parrafo;
    }

    public String toString(){
        return parrafo+"\n";
    }

    public boolean tieneTema(String tema) {
        return this.parrafo.contains(tema);
    }
}
