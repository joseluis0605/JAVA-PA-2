package com.company.tipoContenido.tipoPelicula;


import com.company.tipoContenido.Contenido;

public class Pelicula extends Contenido {

    private Genero genero;

    public Pelicula(String titulo, int duracion, Genero genero){
        super(titulo, duracion);
        this.genero= genero;
    }

    @Override
    public String toString() {
        return "PELICULA: "+super.toString()+" genero: "+genero+"\n";
    }

    @Override
    public boolean esPelicula() {
        return true;
    }

    public Genero getGenero() {
        return genero;
    }
}
