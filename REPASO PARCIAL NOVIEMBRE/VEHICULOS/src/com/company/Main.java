package com.company;

import com.company.tipoVehiculo.Bicicleta;
import com.company.tipoVehiculo.Coche;
import com.company.tipoVehiculo.tipoCoche.Camioneta;

public class Main {

    public static void main(String[] args) {

        Gestor gestor= new Gestor();

        Coche coche1= new Coche("azul", 4, 120, 150);
        Camioneta camioneta1= new Camioneta("verde", 4, 120, 250, 1000);
        Bicicleta bicicleta1= new Bicicleta("amarillo", 2, TipoBicicleta.DEPORTIVA);

        gestor.addVehiculo(camioneta1);
        gestor.addVehiculo(coche1);
        gestor.addVehiculo(bicicleta1);

        gestor.mostrar();
    }
}
