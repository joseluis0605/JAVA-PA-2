package com.company;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;

public class Gestor {

    private Bicicleta general[];
    private Bicicleta listadoCarretera[];
    private Bicicleta listadoMontana[];
    private int indiceCarretera;
    private int indiceMontana;
    private int indiceGeneral;

    public Gestor(){
        this.indiceCarretera= 0;
        this.indiceMontana= 0;
        this.indiceGeneral= 0;
        this.listadoCarretera= new Bicicleta[10];
        this.listadoMontana= new Bicicleta[10];
        this.general= new Bicicleta[10];
    }

    public void addBicicleta(Bicicleta bicicleta){
        if (indiceGeneral < general.length){
            this.general[indiceGeneral]= bicicleta;
            if (general[indiceGeneral].esMontana()){
                listadoMontana[indiceMontana]= bicicleta;
                indiceMontana++;
            }else {
                listadoCarretera[indiceCarretera]=bicicleta;
                indiceCarretera++;
            }

            this.indiceGeneral++;
        }
    }

    public void mostrarDadaMarca(String marca){
        for (int i = 0; i < indiceGeneral; i++) {
            if (general[i].esMarca(marca)){
                System.out.println(general[i]);
            }
        }
    }

    public boolean hayStockMontana(){
        return this.indiceMontana<listadoMontana.length;
    }

    public boolean hayStockCarretera(){
        return this.indiceCarretera<this.listadoCarretera.length;
    }

    public void mostrarCarretera(){
        for (int i = 0; i < indiceCarretera; i++) {
            System.out.println(listadoCarretera[i]);
        }
    }

    public void mostrarMontana(){
        for (int i = 0; i < indiceMontana; i++) {
            System.out.println(listadoMontana[i]);
        }
    }

    public void mostrarGeneral(){
        for (int i = 0; i < indiceGeneral; i++) {
            System.out.println(general[i]);
        }
    }
}
