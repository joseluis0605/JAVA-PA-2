package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Gestor gestor= new Gestor();

        gestor.addPersona("jose", "perez", 1 );
        gestor.addPersona("pedro", "romero", 2 );
        gestor.addPersona("jose", "perez", 3 );
        gestor.addPersona("luis", "ruan", 4 );
        gestor.addPersona("jose", "abde", 5 );
        gestor.addPersona("mario", "mezquita", 6 );
        gestor.addPersona("jose", "fati", 7 );

        gestor.mostrarApellidosOrdenado();
    }
}