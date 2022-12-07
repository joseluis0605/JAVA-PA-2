package com.company;

import java.text.CollationElementIterator;
import java.util.*;

public class Gestor {

    private Map<String, ArrayList<Alumno>> mapaNacionalidad; //busqueda por nacionalidad

    public Gestor(){
        this.mapaNacionalidad= new HashMap<>();
    }

    public void addPersona(String nombre, String nacionalidad, String sexo, int expediente){
        Alumno alumno= new Alumno(nombre, nacionalidad, sexo, expediente);

        ArrayList<Alumno> listaNacionalidad= mapaNacionalidad.get(nacionalidad);
        if (listaNacionalidad==null){
            listaNacionalidad= new ArrayList<>();
        }
        listaNacionalidad.add(alumno);
        mapaNacionalidad.put(nacionalidad, listaNacionalidad);


    }

    public void mostrarTodo(){
        for (Map.Entry<String, ArrayList<Alumno>> valor : mapaNacionalidad.entrySet()){
            System.out.println("CLAVE  "+valor.getKey());
            System.out.println(valor.getValue());
        }
    }

    public void mostrarDadaNacionalidad(String nacionalidad){
        System.out.println(mapaNacionalidad.get(nacionalidad));
    }

    public void mostrarOrdenadaClave(){
        Set<String> sete= mapaNacionalidad.keySet();
        ArrayList<String> lista= new ArrayList<>();
        for (String pais : sete){
            lista.add(pais);
        }
        Collections.sort(lista, new ComparadorString());
        System.out.println(lista);
    }

    public void mostrarOrdenadaNacionalidad(String nacionalidad){
        ArrayList<Alumno> lista= mapaNacionalidad.get(nacionalidad);
        System.out.println("mostramos los alumnos con la nacionalidad: "+nacionalidad);
        Collections.sort(lista, new ComparadorExpediente());
        for (Alumno alumno : lista){
            System.out.println(alumno);
        }

    }
}
