package com.company;

import com.company.Exceptions.NoHackerAvailableException;
import com.company.amenaza.Amenaza;
import com.company.hackers.Hacker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Gestor {

    private Map<Urgencia, ArrayList<Amenaza>> mapaUrgenciaNoTratada;
    private Map<Hacker, ArrayList<Amenaza>> mapaHacker;
    private ArrayList<Hacker> plantilla;

    public Gestor(){
        mapaUrgenciaNoTratada= new HashMap<>();
        this.mapaHacker= new HashMap<>();
        this.plantilla= new ArrayList<>();
    }

    public void registrarAmenaza(Amenaza amenaza){

        //REGISTRAMOS AMENAZA MAPA URGENCIAS NO TRATADAS
        ArrayList<Amenaza> lista= mapaUrgenciaNoTratada.get(amenaza.getUrgencia());
        if (lista==null){
            lista= new ArrayList<>();
            lista.add(amenaza);
            mapaUrgenciaNoTratada.put(amenaza.getUrgencia(), lista);
        }else {
            lista.add(amenaza);
            mapaUrgenciaNoTratada.put(amenaza.getUrgencia(), lista);
        }
    }

    public void mostrarNoTratadas(){
        for (Map.Entry<Urgencia, ArrayList<Amenaza>> valor : mapaUrgenciaNoTratada.entrySet()){
            System.out.println(valor.getKey());
            System.out.println(valor.getValue());
            System.out.println("***************************");
        }
    }

    public void asignarAmenaza(){
        //probamos a asignar todas las de alto nivel de urgencia
        ArrayList<Amenaza> listaAlta= mapaUrgenciaNoTratada.get(Urgencia.ALTA);
        if (listaAlta!=null){
            for (Amenaza amenaza : listaAlta){
                for (Hacker hacker : plantilla){
                    try{
                        hacker.addAmenaza(amenaza);
                        asignarAmenazaHacker(amenaza, hacker);
                        listaAlta.remove(amenaza);
                    }catch (NoHackerAvailableException e){
                        System.out.println("ERROR");
                    }
                }
            }
            mapaUrgenciaNoTratada.put(Urgencia.ALTA, listaAlta);
        }

        //probamos a asignar todas las de medio nivel de urgencia
        ArrayList<Amenaza> listaMedia= mapaUrgenciaNoTratada.get(Urgencia.MEDIA);
        if (listaMedia!=null){
            for (Amenaza amenaza : listaMedia){
                for (Hacker hacker : plantilla){
                    try{
                        hacker.addAmenaza(amenaza);
                        asignarAmenazaHacker(amenaza, hacker);
                        listaMedia.remove(amenaza);
                    }catch (NoHackerAvailableException e){
                        System.out.println("ERROR");
                    }
                }
            }
            mapaUrgenciaNoTratada.put(Urgencia.MEDIA, listaMedia);
        }


    }

    private void asignarAmenazaHacker(Amenaza amenaza, Hacker hacker) {
        ArrayList<Amenaza> lista= mapaHacker.get(hacker);
        if (lista==null){
            lista= new ArrayList<>();
            lista.add(amenaza);
            mapaHacker.put(hacker, lista);
        }
    }

    public void mostrarHacker(Hacker hacker){
        System.out.println(mapaHacker.get(hacker));
    }


}
