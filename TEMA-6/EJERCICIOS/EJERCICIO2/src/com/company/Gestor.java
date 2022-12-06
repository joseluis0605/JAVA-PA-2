package com.company;

import java.util.*;

public class Gestor {

    private Map<String, ArrayList<Persona>> mapaNombre;

    public Gestor(){
        this.mapaNombre= new HashMap<>();
    }

    public void addPersona(String nombre, int edad, int notaMedia){
        Persona persona= new Persona(nombre, edad, notaMedia);

        ArrayList<Persona> listaAux= mapaNombre.get(nombre);
        if (listaAux==null){
            listaAux= new ArrayList<>();
            listaAux.add(persona);
            mapaNombre.put(nombre, listaAux);
        }else {
            listaAux.add(persona);
            mapaNombre.put(nombre, listaAux);
        }
    }

    public void mostrar(){
        for (Map.Entry<String, ArrayList<Persona>> valor : mapaNombre.entrySet()){
            System.out.println("CLAVE: "+valor.getKey());
            System.out.println(valor.getValue());
        }
    }

    public void mostrarNombreOrdenado(){
        for (Map.Entry<String, ArrayList<Persona>> valor: mapaNombre.entrySet()){
            Collections.sort(valor.getValue(), new ComparadorNombre());
            System.out.println(valor.getValue());
        }
    }

    public void mostrarTodosNombres(){
        Set<String> conjunto= mapaNombre.keySet();
        ArrayList<String> listadoNombres= new ArrayList<>();

        for (String nombre: conjunto){
            listadoNombres.add(nombre);
        }

        Collections.sort(listadoNombres, new ComparadorString());
        System.out.println(listadoNombres);
    }
}
