package com.company;

public abstract class Bicicleta {

    private String marca;
    private String modelo;
    private int precio;

    public Bicicleta(String marca, String modelo, int precio){
        this.precio= precio;
        this.modelo= modelo;
        this.marca= marca;
    }

    public String toString(){
        return "marca: "+marca+" modelo: "+modelo+" precio: "+precio;
    }

    protected int getPrecio() {
        return precio;
    }

    protected void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract boolean esMontana();

    public abstract boolean esCarretera();

    public boolean esMarca(String marca) {
        return this.marca.equals(marca);
    }
}
