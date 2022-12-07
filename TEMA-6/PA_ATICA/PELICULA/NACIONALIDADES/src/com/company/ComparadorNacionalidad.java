package com.company;

import java.util.Comparator;

public class ComparadorNacionalidad implements Comparator<Alumno> {

    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getNacionalidad().compareTo(o2.getNacionalidad());
    }
}
