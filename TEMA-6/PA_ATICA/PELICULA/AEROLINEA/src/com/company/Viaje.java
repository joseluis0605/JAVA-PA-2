package com.company;

import java.util.Objects;

public class Viaje {

    private String origen;
    private String destino;
    private int duracion;

    public Viaje(String origen, String destino, int duracion){
        this.origen=origen;
        this.destino= destino;
        this.duracion= duracion;
    }

    public String toString(){
        return "origen: "+this.origen+" destino: "+destino+" duracion: "+duracion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viaje viaje = (Viaje) o;
        return duracion == viaje.duracion && origen.equals(viaje.origen) && destino.equals(viaje.destino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origen, destino, duracion);
    }
}
