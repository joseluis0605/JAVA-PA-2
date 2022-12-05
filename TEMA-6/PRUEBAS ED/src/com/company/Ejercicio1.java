package com.company;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    private List<String> miLista;

    public Ejercicio1(){
        this.miLista= new ArrayList<>();
    }

    public void addLista(String cadena){
        this.miLista.add(cadena);
    }

    public void deleteLista(String cadena){
        this.miLista.remove(cadena);
    }

    public void mostrarLista(){
        for (String cadena : miLista){
            System.out.println("elemento: "+cadena);
        }
    }

    public void estaContenido(String cadena){
        System.out.println(miLista.contains(cadena));
    }
}


/*
Crear un ejemplo básico para probar el de las listas
• Declarar una lista de elementos de tipo String.
• Añadir y eliminar elementos de la lista
• Mostrar todos los elementos de la lista (sin utilizar iteradores)
• Definir un método addElemToList(…) que reciba una lista de String y un
String como parámetro y la añada a la lista
• Comprobad que puede tener duplicados
 */