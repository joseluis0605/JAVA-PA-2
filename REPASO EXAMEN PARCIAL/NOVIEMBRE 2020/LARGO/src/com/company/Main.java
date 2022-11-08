package com.company;

import com.company.empleado.AdminServicio;
import com.company.empleado.Asalariado;
import com.company.empleado.profesor.Laboral;
import com.company.empleado.profesor.Titular;

public class Main {

    public static void main(String[] args) {

        ComunidadUniversitaria comunidadUniversitaria= new ComunidadUniversitaria();

        Estudiante estudiante1= new Estudiante("nombre1", "apellido1", "100", 18, Grado.CIBERSEGURIDAD);
        Estudiante estudiante2= new Estudiante("nombre2", "apellido2", "101", 20, Grado.COMPUTADORES);
        Estudiante estudiante3= new Estudiante("nombre3", "apellido3", "102", 18, Grado.SOFTWARE);
        Estudiante estudiante4= new Estudiante("nombre4", "apellido4", "103", 19, Grado.INFORMATICA);
        Estudiante estudiante5= new Estudiante("nombre5", "apellido5", "104", 18, Grado.CIBERSEGURIDAD);
        Estudiante estudiante6= new Estudiante("nombre6", "apellido6", "105", 19, Grado.CIBERSEGURIDAD);
        Estudiante estudiante7= new Estudiante("nombre7", "apellido7", "106", 18, Grado.SOFTWARE);
        Estudiante estudiante8= new Estudiante("nombre8", "apellido8", "107", 21, Grado.CIBERSEGURIDAD);
        Estudiante estudiante9= new Estudiante("nombre9", "apellido9", "108", 22, Grado.COMPUTADORES);

        comunidadUniversitaria.addPersona(estudiante1);
        comunidadUniversitaria.addPersona(estudiante2);
        comunidadUniversitaria.addPersona(estudiante3);
        comunidadUniversitaria.addPersona(estudiante4);
        comunidadUniversitaria.addPersona(estudiante5);
        comunidadUniversitaria.addPersona(estudiante6);
        comunidadUniversitaria.addPersona(estudiante7);
        comunidadUniversitaria.addPersona(estudiante8);
        comunidadUniversitaria.addPersona(estudiante9);


        Asalariado asalariado1= new Asalariado("nombre1", "apellido1", "200", 40, 2000, 2023);
        Asalariado asalariado2= new Asalariado("nombre1", "apellido1", "201", 40, 2000, 2020);
        Asalariado asalariado3= new Asalariado("nombre1", "apellido1", "202", 40, 2010, 2022);
        Asalariado asalariado4= new Asalariado("nombre1", "apellido1", "203", 40, 2012, 2021);
        Asalariado asalariado5= new Asalariado("nombre1", "apellido1", "204", 40, 2007, 2022);
        Asalariado asalariado6= new Asalariado("nombre1", "apellido1", "205", 40, 2006, 2021);

        comunidadUniversitaria.addPersona(asalariado1);
        comunidadUniversitaria.addPersona(asalariado2);
        comunidadUniversitaria.addPersona(asalariado3);
        comunidadUniversitaria.addPersona(asalariado4);
        comunidadUniversitaria.addPersona(asalariado5);
        comunidadUniversitaria.addPersona(asalariado6);

        Titular titular1= new Titular("nombre1", "apellido1", "200", 40, 2000, "mates");
        Titular titular2= new Titular("nombre1", "apellido1", "200", 40, 2015, "ciencias");
        Titular titular3= new Titular("nombre1", "apellido1", "200", 40, 2004, "hardware");
        Titular titular4= new Titular("nombre1", "apellido1", "200", 40, 2001, "programacion");

        comunidadUniversitaria.addPersona(titular1);
        comunidadUniversitaria.addPersona(titular2);
        comunidadUniversitaria.addPersona(titular3);
        comunidadUniversitaria.addPersona(titular4);

        Laboral laboral1= new Laboral("nombre1", "apellido1", "201", 40, 2000, "mates", 2000);
        Laboral laboral2= new Laboral("nombre2", "apellido2", "201", 40, 2010, "mates", 2000);
        Laboral laboral3= new Laboral("nombre3", "apellido3", "201", 40, 2005, "hardware", 2000);
        Laboral laboral4= new Laboral("nombre4", "apellido4", "201", 40, 2006, "mates", 2020);
        Laboral laboral5= new Laboral("nombre5", "apellido5", "201", 40, 2007, "hardware", 2000);
        Laboral laboral6= new Laboral("nombre6", "apellido6", "201", 40, 2007, "mates", 2020);

        comunidadUniversitaria.addPersona(laboral1);
        comunidadUniversitaria.addPersona(laboral2);
        comunidadUniversitaria.addPersona(laboral3);
        comunidadUniversitaria.addPersona(laboral4);
        comunidadUniversitaria.addPersona(laboral5);
        comunidadUniversitaria.addPersona(laboral6);

        AdminServicio adminServicio1= new AdminServicio("nombre6", "apellido6", "201", 40, 2007, Seccion.BIBLIOTECA);
        AdminServicio adminServicio2= new AdminServicio("nombre6", "apellido6", "201", 40, 2007, Seccion.RECTORADO);
        AdminServicio adminServicio3= new AdminServicio("nombre6", "apellido6", "201", 40, 2007, Seccion.SECRETARIA);

        comunidadUniversitaria.addPersona(adminServicio1);
        comunidadUniversitaria.addPersona(adminServicio2);
        comunidadUniversitaria.addPersona(adminServicio3);


        //comunidadUniversitaria.mostrarComunidad();

        //comunidadUniversitaria.termina(2020);

        //comunidadUniversitaria.mostrarSeccion(Seccion.BIBLIOTECA);

        comunidadUniversitaria.gradoMasSolicitado();
    }
}
