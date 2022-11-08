package com.company;

public class Carretera extends  Bicicleta{

    private int peso;

    public Carretera(String marca, String modelo, int precio, int peso){
        super(marca, modelo, precio);
        addPrecio();
        this.peso= peso;
        pesoMayor();
    }

    private void pesoMayor() {
        if (peso < 6){
            int precio= getPrecio();
            precio= precio + 150;
            setPrecio(precio);
        }
    }

    private void addPrecio() {
        int precio= getPrecio();
        precio= precio+50;
        setPrecio(precio);
    }

    public String toString(){
        return super.toString()+" peso: "+peso;
    }

    @Override
    public boolean esMontana() {
        return false;
    }

    @Override
    public boolean esCarretera() {
        return true;
    }
}
