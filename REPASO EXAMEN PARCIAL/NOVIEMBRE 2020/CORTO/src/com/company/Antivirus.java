package com.company;

public abstract class Antivirus {

    private int numeroDispositivos;


    public Antivirus(int numeroDispositivos){
        this.numeroDispositivos= numeroDispositivos;
    }

    public String toString(){
        return "dispositivos: "+numeroDispositivos;
    }

    protected void setNumeroDispositivos(int numeroDispositivos) {
        this.numeroDispositivos = numeroDispositivos;
    }

    protected int getNumeroDispositivos() {
        return numeroDispositivos;
    }
}
