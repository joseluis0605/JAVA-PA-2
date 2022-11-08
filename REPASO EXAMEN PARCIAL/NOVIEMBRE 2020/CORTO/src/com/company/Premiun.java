package com.company;

public abstract class Premiun extends Antivirus{

    private int precio;

    public Premiun(int numero){
        super(numero);
        precio=0;
    }

    protected void setPrecio(int precio) {
        this.precio = precio;
    }

    protected int getPrecio() {
        return precio;
    }
}
