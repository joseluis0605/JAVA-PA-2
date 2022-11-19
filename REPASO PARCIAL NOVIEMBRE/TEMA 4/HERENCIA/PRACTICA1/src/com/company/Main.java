package com.company;

import com.company.tiposBicicleta.Carretera;
import com.company.tiposBicicleta.Montana;

public class Main {

    public static void main(String[] args) {

        Gestor gestor= new Gestor();


        Carretera carretera1= new Carretera("marca1", "modelo1", 100, 5);
        Carretera carretera2= new Carretera("marca2", "modelo1", 100, 10);
        Carretera carretera3= new Carretera("marca2", "modelo1", 200, 5);
        Carretera carretera4= new Carretera("marca4", "modelo1", 100, 6);
        Carretera carretera5= new Carretera("marca3", "modelo1", 100, 5);

        Montana montana1= new Montana("marca1", "modelo1", 100, true);
        Montana montana2= new Montana("marca1", "modelo2", 100, true);
        Montana montana3= new Montana("marca2", "modelo3", 100, false);
        Montana montana4= new Montana("marca1", "modelo1", 100, true);
        Montana montana5= new Montana("marca4", "modelo1", 100, false);

        gestor.addCarretera(carretera1);
        gestor.addCarretera(carretera2);
        gestor.addCarretera(carretera3);
        gestor.addCarretera(carretera4);
        gestor.addCarretera(carretera5);

        gestor.addMontana(montana1);
        gestor.addMontana(montana2);
        gestor.addMontana(montana3);
        gestor.addMontana(montana4);
        gestor.addMontana(montana5);

        //gestor.mostrarMarca("marca1");

        //gestor.mostrar();




    }
}
