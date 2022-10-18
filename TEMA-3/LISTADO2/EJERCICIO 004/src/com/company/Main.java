package com.company;

public class Main {

    public static void main(String[] args) {


        Plantilla plantilla= new Plantilla(10);

        Persona persona1= new Persona("nombre1", "apellido1", new Dni(1,"A"), 20, 1200);
        Persona persona2= new Persona("nombre2", "apellido2", new Dni(2,"A"), 30, 2200);
        Persona persona3= new Persona("nombre3", "apellido3", new Dni(3,"A"), 18, 5600);
        Persona persona4= new Persona("nombre4", "apellido4", new Dni(4,"A"), 25, 2300);
        Persona persona5= new Persona("nombre5", "apellido5", new Dni(5,"A"), 33, 1200);
        Persona persona6= new Persona("nombre6", "apellido6", new Dni(6,"A"), 45, 1000);
        Persona persona7= new Persona("nombre7", "apellido7", new Dni(7,"A"), 62, 1000);
        Persona persona8= new Persona("nombre8", "apellido8", new Dni(8,"A"), 21, 3000);
        Persona persona9= new Persona("nombre9", "apellido9", new Dni(9,"A"), 22, 2000);

        plantilla.addPersona(persona1);
        plantilla.addPersona(persona2);
        plantilla.addPersona(persona3);
        plantilla.addPersona(persona4);
        plantilla.addPersona(persona5);
        plantilla.addPersona(persona6);
        plantilla.addPersona(persona7);
        plantilla.addPersona(persona8);
        plantilla.addPersona(persona9);

        persona1.addHoraExtra();
        persona3.addHoraExtra();

        plantilla.rangoEdad();


    }
}
