package com.company;

public class Main {

    public static void main(String[] args) {

        Persona persona= new Persona("jose luis", "1");

        Centro_Control centro_control= new Centro_Control();

        Multa multa1=new Multa("1", 100, 1);
        Multa multa2=new Multa("2", 100, 3);
        Multa multa3=new Multa("3", 100, 2);
        Multa multa4=new Multa("1", 100, 1);

        centro_control.addMulta(multa1);
        centro_control.addMulta(multa2);
        centro_control.addMulta(multa3);
        centro_control.addMulta(multa4);

        centro_control.mostrarPersona(persona);
    }
}
