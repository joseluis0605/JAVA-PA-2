package com.company;

public class Main {

    public static void main(String[] args) {


        Gestor gestor= new Gestor();

        gestor.add("madrid", "berlin", 120);
        gestor.add("paris","bruselas", 230);
        gestor.add("madrid", "budapest", 80);
        gestor.add("viena", "berlin", 210);
        gestor.add("madrid", "cophenague", 350);
        gestor.add("madrid", "lisboa", 70);

        gestor.mostrarCiudades();
    }
}
