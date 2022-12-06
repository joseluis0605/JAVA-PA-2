package com.company;

import java.util.Comparator;

public class ComparadorExpediente implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        if (o1.getExpediente()<o2.getExpediente()){
            return -1;
        }else  if (o1.getExpediente()> o2.getExpediente()){
            return 1;
        }else {
            return 0;
        }
    }
}
