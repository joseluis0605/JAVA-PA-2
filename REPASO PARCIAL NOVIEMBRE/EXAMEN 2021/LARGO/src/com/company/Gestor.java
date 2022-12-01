package com.company;



public class Gestor {

    private Generica listado[];
    private int indice;

    public Gestor(){
        this.listado= new Generica[10];
        this.indice=0;

    }

    public void addNoticia( Generica generica){
        if (indice< listado.length){
            listado[indice]=generica;
            indice++;
        }
    }

    public void mostrarTodas(){
        for (int i = 0; i < indice; i++) {
            System.out.println("****************************");
            System.out.println(listado[i]);
        }
    }

    //MOSTRAR PUBLICADAS EN CIERTA FECHA (AÑO)
    public void mostrarFecha(Fecha fecha){
        for (int i = 0; i < indice; i++) {
            if (listado[i].mismaFecha(fecha)){
                System.out.println("*************************");
                System.out.println(listado[i]);
            }
        }
    }

    public void mostrarPalabra(String palabra) {
        for (int i = 0; i < indice; i++) {
            if (listado[i].estaPalabra(palabra)){
                System.out.println("*******************");
                System.out.println("ENCONTRADA");
                System.out.println(listado[i]);
            }
        }
    }

    public void mostrarKeywords(){
        for (int i = 0; i < indice; i++) {
            listado[i].empiezaMayuscula();
        }
    }

    public void mostrarTwitter(){
        for (int i = 0; i < indice; i++) {
            if (listado[i].esTwitter()){
                System.out.println(listado[i]);
            }
        }
    }


}
