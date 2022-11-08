package com.company;

public class Full extends Premiun{

    public Full(int numeroDispositivos){
        super(numeroDispositivos);
        setNumeroDispositivos(numeroDispositivos);
        setPrecio(120);
    }

    public String toString(){
        return "COBERTURA PAURJC\n"+"cobertura premium con numero de dispositivos: "+getNumeroDispositivos()+"\n"+"precio: "+getPrecio();
    }
}
