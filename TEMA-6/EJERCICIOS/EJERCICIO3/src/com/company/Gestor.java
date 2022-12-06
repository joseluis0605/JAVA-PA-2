package com.company;

import java.util.*;

public class Gestor {

    private Map<String, ArrayList<Persona>> mapaExpediente;

    public Gestor(){
        this.mapaExpediente= new HashMap<>();
    }

    public void addPersona(String nombre, String apellido, int expediente){
        Persona persona= new Persona(nombre, apellido, expediente);

        ArrayList<Persona> listaPersona= mapaExpediente.get(nombre);

        if (listaPersona==null){
            listaPersona= new ArrayList<>();
        }
        if (!listaPersona.contains(persona)){
            listaPersona.add(persona);
        }

        mapaExpediente.put(nombre, listaPersona);
    }

    public void mostrarPersonas(){
        for (Map.Entry<String, ArrayList<Persona>> valor: mapaExpediente.entrySet()){
            System.out.println("CLAVE: "+valor.getKey());
            System.out.println(valor.getValue());
        }
    }

    public void mostrarExpedienteOrdenado(){
        Set<Persona> conjunto= new HashSet<>();
        for (Map.Entry<String, ArrayList<Persona>> valor : mapaExpediente.entrySet()){
            conjunto.addAll(valor.getValue());
        }

        ArrayList<Persona> listado= new ArrayList<>();
        for (Persona persona : conjunto){
            if (!listado.contains(persona)){
                listado.add(persona);
            }
        }

        Collections.sort(listado, new ComparadorExpediente());
        System.out.println(listado);
    }

    public void mostrarApellidosOrdenado(){
        Set<Persona> conjunto= new HashSet<>();

        for (Map.Entry<String, ArrayList<Persona>> valor : mapaExpediente.entrySet()){
            conjunto.addAll(valor.getValue());
        }

        ArrayList<Persona> listado= new ArrayList<>();

        for (Persona persona : conjunto){
            if (!listado.contains(persona)){
                listado.add(persona);
            }
        }

        Collections.sort(listado, new ComparadorApellidos());
        System.out.println(listado);
    }


}
