package com.company;

public class Boletin {

    private Generica listado[];
    private int numero;

    public Boletin(){
        this.listado= new Generica[100];
        this.numero=0;
    }

    public void addNoticia(Generica generica){
        if (numero< listado.length){
            this.listado[numero]=generica;
            numero++;
        }
    }

    public void mostrar(){
        for (int i = 0; i < numero; i++) {
            System.out.println("**************************");
            System.out.println(listado[i]);
        }
    }

    public void mostrarFecha(Fecha fecha){
        for (int i = 0; i < numero; i++) {
            if (listado[i].mismaFecha(fecha)){
                System.out.println("*************************");
                System.out.println(listado[i]);
            }
        }
    }

    public void mostrarTema(String tema){
        for (int i = 0; i < numero; i++) {
            if (listado[i].mismoTema(tema)){
                System.out.println("************************");
                System.out.println(listado[i]);
            }
        }
    }

    public void mostrarCortas(){
        for (int i = 0; i < numero; i++) {
            if (listado[i].esCorta()){
                System.out.println("********************");
                System.out.println(listado[i]);
            }
        }
    }
}
