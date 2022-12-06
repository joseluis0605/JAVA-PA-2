package com.company;

public class Main {

    public static void main(String[] args) {


        Gestor gestor= new Gestor();

        gestor.addPersona("jose luis", 19, 8);
        gestor.addPersona("mario", 21, 9);
        gestor.addPersona("jose luis", 12, 4);
        gestor.addPersona("pedro", 23, 3);
        gestor.addPersona("jose luis", 19, 6);
        gestor.addPersona("antonio", 19, 4);

        gestor.mostrarTodosNombres();
    }
}
