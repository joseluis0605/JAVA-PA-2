package com.company;

import java.util.Objects;

public class Juego {

    private String nombre;
    private int precio;

    public Juego(String nombre, int precio){
        this.nombre=nombre;
        this.precio= precio;
    }

    @Override
    public String toString() {
        return this.nombre+" "+precio+"€";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Juego juego = (Juego) o;
        return Objects.equals(nombre, juego.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
