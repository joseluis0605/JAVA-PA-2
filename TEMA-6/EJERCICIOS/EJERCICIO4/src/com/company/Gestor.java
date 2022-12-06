package com.company;

import java.util.*;

public class Gestor {

    private Map<Integer, ArrayList<Usuario>> mapaNickname;

    public Gestor(){
        this.mapaNickname= new HashMap<>();
    }

    public void addUser(String nombre, int ganadas, int jugadas){
        Usuario usuario= new Usuario(nombre, ganadas, jugadas);

        ArrayList<Usuario> listaAux= mapaNickname.get(ganadas);
        if (listaAux==null){
            listaAux= new ArrayList<>();
        }
        if (!listaAux.contains(usuario)){
            listaAux.add(usuario);
            mapaNickname.put(ganadas, listaAux);
        }
    }

    public void mostrar(){
        for (Map.Entry<Integer, ArrayList<Usuario>> valor : mapaNickname.entrySet()){
            System.out.println("CLAVE "+valor.getKey());
            System.out.println(valor.getValue());
        }
    }


    public void mostrarGanadasOrdenado() {

        Set<Integer> conjunto= mapaNickname.keySet();
        ArrayList<Integer> lista= new ArrayList<>();

        for (Integer valor : conjunto){
            lista.add(valor);
        }

        Collections.sort(lista, new ComparadorEnteros());
        System.out.println(lista);
    }

    public void ordenarNickname(){
        Set<Usuario> conjunto= new HashSet<>();
        ArrayList<Usuario> lista= new ArrayList<>();

        for (Map.Entry<Integer, ArrayList<Usuario>> valor : mapaNickname.entrySet()){
            conjunto.addAll(valor.getValue());
        }

        for (Usuario usuario : conjunto){
            lista.add(usuario);
        }

        Collections.sort(lista, new ComparadorNickname());
        System.out.println(lista);
    }
}
