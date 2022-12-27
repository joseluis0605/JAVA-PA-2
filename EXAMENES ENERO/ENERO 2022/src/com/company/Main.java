package com.company;

import com.company.excepciones.UsuarioRegistradoException;
import com.company.excepciones.VehiculoRegistradoException;
import com.company.tipoCombustion.Combustion;
import com.company.tipoCombustion.tipoCombustion;
import com.company.tipoECO.Electrico;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Gestor gestor= new Gestor();


        try {
            gestor.registradUsuario("1");
            gestor.registradUsuario("2");
            gestor.registradUsuario("3");
            gestor.registradUsuario("4");

        } catch (UsuarioRegistradoException e) {
            e.printStackTrace();
        }

        Electrico electrico1 = new Electrico("1", 100, 5000);
        Electrico electrico2 = new Electrico("2", 100, 5000);
        Electrico electrico3 = new Electrico("3", 100, 5000);
        Electrico electrico4 = new Electrico("4", 100, 5000);
        Electrico electrico5 = new Electrico("5", 100, 5000);

        Combustion combustion1= new Combustion("6", 200, tipoCombustion.GASOLINA);

        try {
            gestor.registrarVehiculo(electrico1, "1");
            gestor.registrarVehiculo(electrico2, "2");
            gestor.registrarVehiculo(electrico3, "3");
            gestor.registrarVehiculo(electrico4, "4");
            gestor.registrarVehiculo(electrico5, "1");
            gestor.registrarVehiculo(combustion1, "2");
        } catch (UsuarioRegistradoException | VehiculoRegistradoException e) {
            e.printStackTrace();
            exit(1);
        }

        gestor.mostrarImpuestoCoche("1", "1");
    }
}
