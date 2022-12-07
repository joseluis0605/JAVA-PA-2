package com.company;

import java.util.Comparator;

public class ComparadorExpediente implements Comparator<Alumno> {

    @Override
    public int compare(Alumno o1, Alumno o2) {
        if (o1.getExpediente()< o2.getExpediente()){
            return -1;
        }else if (o1.getExpediente()==o2.getExpediente()){
            return 0;
        }else {
            return 1;
        }
    }
}
