package com.company;

import com.company.tipoEmpleado.PAS;
import com.company.tipoEmpleado.tipoPDI.Doctor;
import com.company.tipoEmpleado.tipoPDI.Titular;

public class Main {

    public static void main(String[] args) {

        Empleado empleado= new Empleado();
        PAS pas= new PAS();
        Titular titular= new Titular();
        Doctor doctor= new Doctor();

        System.out.println(empleado);
        System.out.println(pas);
        System.out.println(titular);
        System.out.println(doctor);

    }
}
