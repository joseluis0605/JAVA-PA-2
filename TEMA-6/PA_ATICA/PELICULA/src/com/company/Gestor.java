package com.company;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Gestor {

    private Map<String, ArrayList<Pelicula>> mapaTitulo;
    private Map<Integer, ArrayList<Pelicula>> mapaYear;
    private Map<String, ArrayList<Pelicula>> mapaGenero;

    public Gestor(){
        mapaTitulo= new HashMap<>();
        mapaYear= new HashMap<>();
        mapaGenero= new HashMap<>();
    }

    public void addContenido(String titulo, int year, ArrayList<String> generos){
        Pelicula pelicula= new Pelicula(titulo, year, generos);

        // añadimos contenido al mapa con clave ---> STRING TITULO
        ArrayList<Pelicula> listaTitulo= mapaTitulo.get(titulo);
        if (listaTitulo==null){
            listaTitulo= new ArrayList<>();
            listaTitulo.add(pelicula);
            mapaTitulo.put(titulo, listaTitulo);
        }else {
            listaTitulo.add(pelicula);
            mapaTitulo.put(titulo, listaTitulo);
        }

        // añadimos contenido al mapa con clave ---> INTEGER AÑO
        ArrayList<Pelicula> listaYear= mapaYear.get(year);
        if (listaYear==null){
            listaYear= new ArrayList<>();
            listaYear.add(pelicula);
            mapaYear.put(year, listaYear);
        }else {
            listaYear.add(pelicula);
            mapaYear.put(year, listaYear);
        }

        // añadimos contenido al mapa con clave ---> STRING GENERO
        for (String genero : generos){
            ArrayList<Pelicula> listaGenero= mapaGenero.get(genero);
            if (listaGenero==null){
                listaGenero= new ArrayList<>();
                listaGenero.add(pelicula);
                mapaGenero.put(genero, listaGenero);
            }else {
                listaGenero.add(pelicula);
                mapaGenero.put(genero, listaGenero);
            }
        }


    }

    public void mostrarTitulo(String titulo){
        System.out.println(mapaTitulo.get(titulo));
    }

    public void mostrarYear(int year){
        System.out.println(mapaYear.get(year));
    }

    public void mostrar1Genero(String genero){
        System.out.println(mapaGenero.get(genero));
    }

    public void mostrarGenerosComunes(ArrayList<String> generos){
        for (String genero : generos){
            System.out.println(mapaGenero.get(genero));
        }
    }

    public void mostrarTodaInformacion(){
        for (Map.Entry<String, ArrayList<Pelicula>> titulo : mapaTitulo.entrySet()){
            System.out.println("CLAVE ---> "+titulo.getKey());
            System.out.println(titulo.getValue());
        }
    }

}
