package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Gestor {

    private Map<String, ArrayList<Viaje>> mapaOrigen;
    private Map<String, ArrayList<Viaje>> mapaDestino;

    public Gestor(){
        this.mapaOrigen= new HashMap<>();
        this.mapaDestino= new HashMap<>();
    }

    public void add(String origen, String destino, int duracion ){
        Viaje viaje= new Viaje(origen,destino, duracion);

        //añadimos al mapa origen
        ArrayList<Viaje> listaConseguida= mapaOrigen.get(origen);
        if (listaConseguida==null){
            listaConseguida= new ArrayList<>();
            listaConseguida.add(viaje);
            mapaOrigen.put(origen, listaConseguida);
        }else {
            listaConseguida.add(viaje);
            mapaOrigen.put(origen, listaConseguida);
        }


        //añadimos al mapa destino
        ArrayList<Viaje> listaDestino= mapaDestino.get(destino);
        if (listaDestino==null){
            listaDestino= new ArrayList<>();
            listaDestino.add(viaje);
            mapaDestino.put(destino, listaDestino);
        }else {
            listaDestino.add(viaje);
            mapaDestino.put(destino, listaDestino);
        }
    }

    public void mostrarOrigen(String origen){
        System.out.println("CIUDAD DE ORIGEN "+origen);
        System.out.println("LISTA DE VIAJES");
        ArrayList<Viaje> listado=mapaOrigen.get(origen);

        for (Viaje viaje : listado){
            System.out.println(viaje);
            System.out.println("*************************");
        }
    }

    public void mostrarDestino(String destino){
        System.out.println("CIUDAD CON DESTINO: "+destino);
        System.out.println("LISTA DE VIAJES ");

        ArrayList<Viaje> lista= new ArrayList<>();
        lista= mapaDestino.get(destino);
        if (lista!=null){
            for (Viaje viaje : lista){
                System.out.println("**********************");
                System.out.println(viaje);
            }
        }
    }
    public void mostrarTodosViajes(){
        for (Map.Entry<String, ArrayList<Viaje>> valor : mapaOrigen.entrySet()){
            System.out.println(valor);
        }
    }
    public void mostrarCiudades(){
        Set<String> origen=  mapaOrigen.keySet(); //tenemos ciudades de origen
        Set<String> destino= mapaDestino.keySet();//tenemos ciudades de destino

        Set<String> todasCiudades= new HashSet<>();
        todasCiudades.addAll(origen);
        todasCiudades.addAll(destino);
        System.out.println(todasCiudades);


    }
}
