package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Gestor gestor= new Gestor();

        gestor.addUser("jose", 10,20);
        gestor.addUser("carlos", 15,20);
        gestor.addUser("pedro", 10,50);
        gestor.addUser("martin", 9,100);
        gestor.addUser("mario", 25,40);

        //gestor.mostrar();

        //gestor.mostrarGanadasOrdenado();

        gestor.ordenarNickname();
    }
}
