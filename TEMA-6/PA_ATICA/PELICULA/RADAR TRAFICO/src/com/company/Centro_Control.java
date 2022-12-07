package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Centro_Control {

    private Map<String, ArrayList<Multa>> mapaMatricula;

    public Centro_Control(){
        this.mapaMatricula= new HashMap<>();
    }

    public void addMulta(Multa multa){
        ArrayList<Multa> lista= mapaMatricula.get(multa.getMatricula());
        if (lista==null) {
            lista = new ArrayList<>();
            lista.add(multa);
            mapaMatricula.put(multa.getMatricula(), lista);
        }else {
            lista.add(multa);
            mapaMatricula.put(multa.getMatricula(), lista);
        }
    }

    public void mostrarPersona(Persona persona){
        String matricula= persona.getMatricula();
        ArrayList<Multa> lista= mapaMatricula.get(matricula);
        float cuantia=0;
        for (Multa multa : lista){
            cuantia= cuantia + multa.getImporteAPagar();
        }
        System.out.println("pagar un total de: "+cuantia+" total del multas de: "+mapaMatricula.get(matricula).size());
    }

    public void mostrarTodo(){
        for (Map.Entry<String, ArrayList<Multa>> valor : mapaMatricula.entrySet()){
            System.out.println(valor.getKey());
            System.out.println(valor.getValue());
        }
    }
}
