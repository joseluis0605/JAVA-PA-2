package com.company;

import com.company.tiposBicicleta.Montana;

public abstract class Bicicleta {

    private String marca;
    private String modelo;
    private int precioBase;

    public Bicicleta(String marca, String modelo, int precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public String toString() {
        return "marca: " + marca + " modelo: " + modelo + " precio: " + precioBase + " ";
    }

    protected String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    protected int getPrecioBase() {
        return precioBase;
    }

    protected void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public boolean mismaMarca(String marca) {
        return this.marca.equals(marca);
    }

    public boolean esMisma(Bicicleta montana) {
        return this.marca.equals(montana.getMarca()) && this.modelo.equals(montana.getModelo());
    }
}

