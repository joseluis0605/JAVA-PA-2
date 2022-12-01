package com.company;

public class Gestor {

    private Vehiculo listado[];
    private int indice;

    public Gestor(){
        this.listado= new Vehiculo[10];
        this.indice=0;
    }

    public void addVehiculo(Vehiculo vehiculo){
        if (indice<listado.length){
            this.listado[indice]=vehiculo;
            indice++;
        }
    }

    public void mostrar(){
        for (int i = 0; i < indice; i++) {
            System.out.println("******************");
            System.out.println(listado[i]);
        }
    }

    public void mostrarRuedas(int numero){
        for (int i = 0; i < indice; i++) {
            if (listado[i].coincideRueda(numero)){
                System.out.println("*******************");
                System.out.println(listado[i]);
            }
        }
    }

    public void mostrarCamioneta(){
        for (int i = 0; i < indice; i++) {
            if (listado[i].esCamioneta()){
                System.out.println("**********************");
                System.out.println(listado[i]);
            }
        }
    }
}
