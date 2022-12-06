package com.company;

import java.util.Comparator;

public class ComparadorApellidos implements Comparator<Persona> {


    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
}
