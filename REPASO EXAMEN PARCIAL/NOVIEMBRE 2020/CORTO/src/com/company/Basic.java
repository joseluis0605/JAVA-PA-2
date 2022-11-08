package com.company;

public class Basic extends Premiun{

    public Basic(int numeroDispositivos){
        super(numeroDispositivos);
        setNumeroDispositivos(numeroDispositivos);
        if (numeroDispositivos==1){
            setPrecio(70);
        }else {
            setPrecio(90);
        }
    }

    @Override
    public String toString() {
        return "COBERTURA PAURJC\n"+"cobertura premium basica\n"+"precio: "+getPrecio();
    }
}
