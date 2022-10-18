package com.company;

public class Gestor {

    private Ciberataque listado[];
    private int numero;

    public Gestor(int tam){
        this.listado= new Ciberataque[tam];
        this.numero= 0;
    }

    public void addCiberataque(Ciberataque ciberataque){
        if (numero < listado.length){
            this.listado[numero]= ciberataque;
            numero++;
        }
    }

    public void mostrar(){
        for (int i=0;i<numero;i++){
            System.out.println(listado[i]);
        }
    }
}
