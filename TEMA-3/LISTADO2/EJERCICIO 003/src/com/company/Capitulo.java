package com.company;

public class Capitulo {

    private String titulo;
    private int duracionMedia;

    public Capitulo(String titulo, int duracionMedia){
        this.titulo= titulo;
        this.duracionMedia= duracionMedia;
    }

    public String toString(){
        return "titulo: "+this.titulo+" "+this.duracionMedia;
    }

    public int getDuracionMedia() {
        return duracionMedia;
    }
}
