package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Pelicula {

    private String titulo;
    private int year;
    private ArrayList<String> tipo;

    public Pelicula(String titulo, int year, ArrayList<String> tipo){
        this.titulo= titulo;
        this.year=year;
        this.tipo= new ArrayList<>();
        this.tipo= tipo;
    }

    public String toString(){
        String cadena= "";
        for (String tipo : this.tipo){
            cadena= cadena+tipo+" ";
        }
        return "titulo: "+this.titulo+" año: "+this.year+" generos: "+cadena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return year == pelicula.year && titulo.equals(pelicula.titulo) && tipo.equals(pelicula.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, year, tipo);
    }
}
