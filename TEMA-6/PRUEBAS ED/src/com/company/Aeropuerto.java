package com.company;

public class Aeropuerto {


    private String origen;
    private String destino;

    public Aeropuerto(String origen, String destino){
        this.origen= origen;
        this.destino=destino;
    }

    public String toString(){
        return "origen: "+this.origen+" destino: "+destino;
    }


}
