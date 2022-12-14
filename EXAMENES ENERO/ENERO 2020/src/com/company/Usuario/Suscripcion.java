package com.company.Usuario;

public enum Suscripcion {

    SD("SD",1,10), HD("HD",2,12), UHD("4K",4,16);

    private String tipo;
    private int numeroDevices;
    private int precio;

    Suscripcion(String tipo, int numeroDevices, int precio){
        this.tipo= tipo;
        this.numeroDevices=numeroDevices;
        this.precio= precio;
    }

    public String toString(){
        return "tipo: "+tipo+" "+numeroDevices+" "+precio+"\n";
    }

    public int getPrecio() {
        return precio;
    }

    public int getNumeroDevices() {
        return numeroDevices;
    }
}
