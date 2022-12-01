package com.company;

import com.company.tipoPersona.Grado;

public class ComunidadUniversitaria {

    private Persona personal[];
    private int indice;

    public ComunidadUniversitaria(){
        this.personal=new Persona[10];
        this.indice= 0;
    }

    public void addPersona(Persona persona){
        if (indice< personal.length){
            personal[indice]= persona;
            indice++;
        }
    }

    public void mostrarTodo(){
        for (int i = 0; i < indice; i++) {
            System.out.println("*********************");
            System.out.println(personal[i]);
        }
    }

    public void mostrarPlantillaYear(int year){
        int contador=0;
        for (int i = 0; i < indice; i++) {
            if (personal[i].terminan(year)){
                contador++;
                System.out.println(personal[i]);
            }
        }
        System.out.println("hay un total de "+contador);
    }
    
    public void gradoSolicitado(){
        int ciber=0;
        int informatica=0;
        int soft=0;
        int computadores=0;
        int videogame=0;
        int mayor=0;
        Grado gradoMax=Grado.SOFTWARE;
        for (int i = 0; i < indice; i++) {
            if (personal[i].eresCiber()){
                ciber++;
                if (mayor<ciber){
                    gradoMax= Grado.CIBERSEGURIDAD;
                    mayor= ciber;
                }
            }else if (personal[i].infor()){
                informatica++;
                if (mayor<informatica){
                    gradoMax= Grado.INFORMATICA;
                    mayor= informatica;
                }
            }else if (personal[i].comp()){
                computadores++;
                if (mayor<computadores){
                    gradoMax= Grado.COMPUTADORES;
                    mayor= computadores;
                }
            }else if (personal[i].soft()){
                soft++;
                if (mayor<soft){
                    gradoMax= Grado.SOFTWARE;
                    mayor= soft;
                }
            }else if (personal[i].videogame()){
                videogame++;
                if (mayor<videogame){
                    gradoMax= Grado.VIDEOJUEGOS;
                    mayor= videogame;
                }
            }else {
            }
        }
        System.out.println("el mayor es "+gradoMax+" con "+mayor);
    }

    public void mostrarSeccion(String seccion){
        for (int i = 0; i < indice; i++) {
            if (personal[i].esSeccion(seccion)){
                System.out.println("*****************");
                System.out.println(personal[i]);
            }
        }
    }
}
