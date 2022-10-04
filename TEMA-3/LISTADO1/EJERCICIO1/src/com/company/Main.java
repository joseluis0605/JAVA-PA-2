package com.company;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Banco banco= new Banco(10);

        Persona persona1= new Persona("nombre1", "apellido1", "1");
        Persona persona2= new Persona("nombre2", "apellido2", "2");
        Persona persona3= new Persona("nombre3", "apellido3", "3");
        Persona persona4= new Persona("nombre4", "apellido4", "4");

        Cuenta cuenta1= new Cuenta(1, 100, new Fecha(1,1,2020));
        Cuenta cuenta2= new Cuenta(2, 100, new Fecha(10,10,2020));
        Cuenta cuenta3= new Cuenta(3, 400, new Fecha(8,5,2020));
        Cuenta cuenta4= new Cuenta(4, 100, new Fecha(21,12,2020));
        Cuenta cuenta5= new Cuenta(5, 200, new Fecha(31,4,2020));
        Cuenta cuenta6= new Cuenta(6, 100, new Fecha(15,11,2020));
        Cuenta cuenta7= new Cuenta(7, 700, new Fecha(16,1,2020));

        persona1.addCuenta(cuenta1);
        persona2.addCuenta(cuenta2);
        persona2.addCuenta(cuenta3);
        persona4.addCuenta(cuenta4);
        persona4.addCuenta(cuenta5);
        persona3.addCuenta(cuenta6);

        banco.addPersona(persona1);
        banco.addPersona(persona2);
        banco.addPersona(persona3);
        banco.addPersona(persona4);

        //banco.mostrarInfoBanco();

        //apartado A
        //banco.numeroCuentasTotal();

        //apartado B
        //banco.mostrarDadoDNI("3");

        //apartado C
        //banco.mostraFecha(new Fecha(2,11,2020));

        //apartado D
        //banco.darBaja(cuenta2, persona2);
        //banco.mostrarDadoDNI("2");

        //apartado E
        persona1.addCuenta(cuenta7);

        //apartado F
        //esta al principio del ejercicio

        //apartado G
        banco.mostrarDadoDNI("1");
        banco.hacerTransferencia(persona1, cuenta1, cuenta6, 200);
        banco.mostrarDadoDNI("1");


    }
}
