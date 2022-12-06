package com.company;

public class Main {

    public static void main(String[] args) {


        Gestor gestor= new Gestor();

        Juego juego1= new Juego("fifa", 69);
        Juego juego2= new Juego("gta", 80);
        Juego juego3= new Juego("fifa", 69);
        Juego juego4= new Juego("fornite", 50);
        Juego juego5= new Juego("fifa", 69);
        Juego juego6= new Juego("fifa", 69);

        gestor.addGame(juego1);
        gestor.addGame(juego2);
        gestor.addGame(juego3);
        gestor.addGame(juego4);
        gestor.addGame(juego5);
        gestor.addGame(juego6);

        gestor.mostrarOrdenPrecio();
    }
}
