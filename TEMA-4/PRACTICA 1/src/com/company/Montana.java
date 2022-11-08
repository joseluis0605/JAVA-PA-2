package com.company;

public class Montana extends Bicicleta{

    private String amortiguadores;

    public Montana(String marca, String modelo, int precio, String amortiguadores){
        super(marca, modelo, precio);
        this.amortiguadores= amortiguadores;
        cambioPrecio();
    }

    private void cambioPrecio() {
        int precio= getPrecio();
        if (this.amortiguadores.equals("si")){
            precio= precio + 60;
            setPrecio(precio);
        }
    }


    public String toString(){
        return super.toString()+" amortiguador: "+ this.amortiguadores;
    }

    @Override
    public boolean esMontana() {
        return true;
    }

    @Override
    public boolean esCarretera() {
        return false;
    }
}
