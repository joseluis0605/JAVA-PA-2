package com.company.tipoContenido;

import java.util.Objects;

public class Contenido {

    private String titulo;
    private  int duracion;

    public Contenido(String titulo, int duracion){
        this.titulo= titulo;
        this.duracion=duracion;
    }

    public String toString(){
        return titulo+" "+duracion+"\n";
    }

    protected void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    protected int getDuracion() {
        return duracion;
    }

    public boolean esPelicula() {
        return false;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contenido contenido = (Contenido) o;
        return duracion == contenido.duracion && Objects.equals(titulo, contenido.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, duracion);
    }
}
