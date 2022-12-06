package com.company;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Juego> {
    @Override
    public int compare(Juego o1, Juego o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }


}
