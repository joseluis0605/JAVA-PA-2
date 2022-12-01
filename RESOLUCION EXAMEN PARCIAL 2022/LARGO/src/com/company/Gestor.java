package com.company;

public class Gestor {

    private Contrato listado[];
    private  int numero;

    public Gestor(){
        this.listado= new Contrato[100];
        this.numero=0;
    }

    public void addContrato(Contrato contrato){
        if (numero<listado.length){
            listado[numero]= contrato;
            numero++;
        }
    }

    public void mostrarInfo(){
        for (int i = 0; i < numero; i++) {
            System.out.println("*********************");
            System.out.println(listado[i]);
        }
    }

    public void mostrarDadoDNI(String dni){
        for (int i = 0; i < numero; i++) {
            if (listado[i].eresPersona(dni)){
                System.out.println("******************");
                System.out.println(listado[i]);
            }
        }
    }

    public void mostrarFechaPosterior(Fecha fecha){
        for (int i = 0; i < numero; i++) {
            if (listado[i].eresPosterior(fecha)){
                System.out.println("*************************");
                System.out.println(listado[i]);
            }
        }
    }
}
