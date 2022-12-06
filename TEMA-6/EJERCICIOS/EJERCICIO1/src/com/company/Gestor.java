package com.company;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gestor {

    private List<Juego> listado;

    public Gestor(){
        listado= new ArrayList<>();
    }

    public void addGame(Juego juego){
        if (!this.listado.contains(juego)){
            this.listado.add(juego);
        }else {
            System.out.println("juego ya introducido");
        }
    }

    public void mostrar(){
        System.out.println(listado);
    }

    public void mostrarOrdenAlfabetico(){
        Collections.sort(listado, new ComparadorNombre());
        System.out.println(listado);
    }

    public void mostrarOrdenPrecio(){
        Collections.sort(listado, new ComparadorPrecio());
        System.out.println(listado);
    }
}
