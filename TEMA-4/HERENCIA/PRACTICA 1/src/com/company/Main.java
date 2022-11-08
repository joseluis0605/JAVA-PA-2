package com.company;

public class Main {

    public static void main(String[] args) {

        Gestor gestor= new Gestor();

        Carretera carretera1= new Carretera("carretera1", "modelo1", 100, 5);
        Carretera carretera2= new Carretera("carretera2", "modelo2", 200, 6);
        Carretera carretera3= new Carretera("carretera3", "modelo3", 200, 2);
        Carretera carretera4= new Carretera("carretera4", "modelo4", 100, 7);
        Carretera carretera5= new Carretera("carretera5", "modelo1", 300, 8);
        Carretera carretera6= new Carretera("carretera6", "modelo1", 100, 5);

        Montana montana1= new Montana("montana1", "modelo1", 200, "si");
        Montana montana2= new Montana("montana2", "modelo2", 700, "no");
        Montana montana3= new Montana("montana3", "modelo2", 300, "si");
        Montana montana4= new Montana("montana4", "modelo3", 500, "no");
        Montana montana5= new Montana("montana5", "modelo5", 100, "si");
        Montana montana6= new Montana("montana6", "modelo1", 200, "si");

        gestor.addBicicleta(carretera1);
        gestor.addBicicleta(carretera2);
        gestor.addBicicleta(carretera3);
        gestor.addBicicleta(carretera4);
        gestor.addBicicleta(carretera5);
        gestor.addBicicleta(carretera6);

        gestor.addBicicleta(montana1);
        gestor.addBicicleta(montana2);
        gestor.addBicicleta(montana3);
        gestor.addBicicleta(montana4);
        gestor.addBicicleta(montana5);
        gestor.addBicicleta(montana6);

        gestor.mostrarMontana();
    }
}
