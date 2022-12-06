package com.company;
import java.util.Comparator;

public class ComparadorPrecio implements Comparator<Juego> {


    @Override
    public int compare(Juego o1, Juego o2) {
        if (o1.getPrecio()<o2.getPrecio()){
            return 1;
        }else if (o1.getPrecio()>o2.getPrecio()){
            return -1;
        }else {
            return 0;
        }
    }
}
