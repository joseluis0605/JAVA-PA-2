package com.company;

import com.company.tipoPersona.Estudiante;
import com.company.tipoPersona.Grado;
import com.company.tipoPersona.tipoEmpleado.Admin;
import com.company.tipoPersona.tipoEmpleado.Laboral;
import com.company.tipoPersona.tipoEmpleado.Titular;

public class Main {

    public static void main(String[] args) {

        ComunidadUniversitaria comunidadUniversitaria= new ComunidadUniversitaria();

        Laboral laboral= new Laboral("jose luis", "mezquita", "1", 22,new Fecha(2022),"mates", new Fecha(2023));

        Titular titular1= new Titular("maria", "martinez", "2", 25, new Fecha(2019), "hacking");

        Estudiante estudiante1= new Estudiante("manolo", "fernandez", "3", 19, Grado.CIBERSEGURIDAD);
        Estudiante estudiante2= new Estudiante("luis", "perez", "4", 19, Grado.SOFTWARE);
        Estudiante estudiante3= new Estudiante("carlos", "fernandez", "5", 19, Grado.CIBERSEGURIDAD);
        Estudiante estudiante4= new Estudiante("pablo", "islun", "6", 19, Grado.INFORMATICA);
        Estudiante estudiante5= new Estudiante("andres", "moro", "7", 19, Grado.CIBERSEGURIDAD);

        Admin admin1= new Admin("alfonso", "timos", "8", 45, new Fecha(2003), "copisteria");

        comunidadUniversitaria.addPersona(laboral);
        comunidadUniversitaria.addPersona(titular1);
        comunidadUniversitaria.addPersona(estudiante1);
        comunidadUniversitaria.addPersona(estudiante2);
        comunidadUniversitaria.addPersona(estudiante3);
        comunidadUniversitaria.addPersona(estudiante4);
        comunidadUniversitaria.addPersona(estudiante5);
        comunidadUniversitaria.addPersona(admin1);

        comunidadUniversitaria.mostrarPlantillaYear(2023);


    }
}
