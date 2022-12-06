package com.company;

import java.util.Comparator;

public class ComparadorGanadas implements Comparator<Usuario> {
    @Override
    public int compare(Usuario o1, Usuario o2) {
        if (o1.getGanadas()<o2.getGanadas()){
            return -1;
        }else if (o1.getGanadas()> o2.getGanadas()){
            return 1;
        }else {
            return 0;
        }
    }
}
