package com.company;

public class Bicicleta {
    private String marca;
    private double precio;
    private String modelo;

    public Bicicleta(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Bicicleta(String marca, String modelo){
        this(marca, modelo, 100);
    }

    public String toString() {
        return "Bicicleta " + this.marca + ", modelo " + this.modelo + ", precio " + this.precio;
    }

    public boolean coincideMarca(String trek) {
        return this.marca.equals(trek);
    }


    public boolean esMisma(Bicicleta bicicleta) {
        return this.marca.equalsIgnoreCase(bicicleta.marca) && this.modelo.equalsIgnoreCase(bicicleta.modelo);
    }
}
