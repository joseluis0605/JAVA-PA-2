package com.company;

public class Main {

    public static void main(String[] args) {

        Gratuito gratuito= new Gratuito();
        System.out.println(gratuito);

        Full full= new Full(10);
        System.out.println(full);

        Basic basic1= new Basic(1);
        System.out.println(basic1);

        Basic basic2= new Basic(5);
        System.out.println(basic2);
    }
}
