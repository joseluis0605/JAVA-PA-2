package com.company;

import com.company.clasesProporcionadas.Contrato;

import java.util.Comparator;

public class ComparadorCliente implements Comparator<Contrato> {


    @Override
    public int compare(Contrato o1, Contrato o2) {
        String nombre1= o1.getCliente().getNombre_apellidos();
        String nombre2= o2.getCliente().getNombre_apellidos();

        if (nombre1.compareTo(nombre2)<0){
            return 1;
        }else if (nombre1.compareTo(nombre2)>0){
            return -1;
        }else {
            return 0;
        }
    }
}
