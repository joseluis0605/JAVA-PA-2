package com.company;

import com.company.tipoProducto.Alarma;
import com.company.tipoProducto.tipoPersonalSeguridad.Escolta;

public class Main {

    public static void main(String[] args) {


        Gestor gestor= new Gestor();

        Cliente cliente1= new Cliente("1", "nombre1", "direccion1");
        Alarma alarma1= new Alarma(100, new Fecha(1,1,2020), new Fecha(2,2,2020), 6);
        Contrato contrato1= new Contrato(new Fecha(1,1,2020),cliente1, alarma1 );

        Cliente cliente2= new Cliente("2", "nombre2", "direccion2");
        Escolta alarma2= new Escolta(100, new Fecha(1,1,2022), new Fecha(1,3,2022), true, 100);
        Contrato contrato2= new Contrato(new Fecha(1,1,2022),cliente2, alarma2 );

        Contrato contrato3= new Contrato(new Fecha(1,1,2020),cliente1, alarma2 );

        gestor.addContrato(contrato1);
        gestor.addContrato(contrato2);
        gestor.addContrato(contrato3);

        //gestor.mostrarInfo();

        //gestor.mostrarDadoDNI("1");

        gestor.mostrarFechaPosterior(new Fecha(1,1,2001));
    }
}
