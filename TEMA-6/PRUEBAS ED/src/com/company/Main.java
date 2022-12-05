package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Ejercicio3 ejercicio3= new Ejercicio3();

        ejercicio3.addViaje("madrid", "barcelona");
        ejercicio3.addViaje("madrid", "paris");
        ejercicio3.addViaje("paris", "roma");

        ejercicio3.mostarClave("roma");
    }
}
