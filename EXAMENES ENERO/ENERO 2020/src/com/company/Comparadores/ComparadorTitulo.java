package com.company.Comparadores;

import com.company.tipoContenido.Contenido;

import java.util.Comparator;

public class ComparadorTitulo implements Comparator<Contenido> {

    @Override
    public int compare(Contenido o1, Contenido o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}
