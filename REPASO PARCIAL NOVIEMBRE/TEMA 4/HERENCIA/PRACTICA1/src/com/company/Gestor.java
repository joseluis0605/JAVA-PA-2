package com.company;

import com.company.tiposBicicleta.Carretera;
import com.company.tiposBicicleta.Montana;



public class Gestor {

    private int numeroMontana;
    private int numeroCarretera;
    private Carretera carretera[];
    private Montana montana[];

    public Gestor(){
        this.numeroCarretera=0;
        this.numeroMontana=0;
        this.carretera= new Carretera[10];
        this.montana= new Montana[10];
    }

    public void addMontana(Montana montana){
        if (numeroMontana<this.montana.length){
            this.montana[numeroMontana]= montana;
            numeroMontana++;
        }
    }

    public void addCarretera(Carretera carretera){
        if (numeroCarretera<this.carretera.length){
            this.carretera[numeroCarretera]= carretera;
            numeroCarretera++;
        }
    }

    public void mostrar(){
        System.out.println("LISTADO CARRETERA");
        for (int i = 0; i < numeroCarretera; i++) {
            System.out.println(carretera[i]);
        }

        System.out.println("************************");

        System.out.println("LISTADO MONTAÑA");
        for (int i = 0; i < numeroMontana; i++) {
            System.out.println(montana[i]);
        }
    }

    public void mostrarMarca(String marca){
        for (int i = 0; i < numeroMontana; i++) {
            if (montana[i].mismaMarca(marca)){
                System.out.println(montana[i]);;
            }
        }
        for (int i = 0; i < numeroCarretera; i++) {
            if (carretera[i].mismaMarca(marca)){
                System.out.println(carretera[i]);;
            }
        }
    }

    public void venderBicicletaMontana(Montana montana){
        for (int i = 0; i < numeroMontana; i++) {
            if (this.montana[i].esMisma(montana)){
                System.out.println(montana);
                desplazarMontana( i);
            }
        }
    }

    public void venderBicicletaCarretera(Carretera carretera){
        for (int i = 0; i < numeroCarretera; i++) {
            if (this.carretera[i].esMisma(carretera)){
                System.out.println(carretera);
                desplazarCarretera( i);
            }
        }
    }

    private void desplazarCarretera(int i) {
        for (int j = i; j < numeroCarretera-1; j++) {
            this.carretera[j]= this.carretera[j+1];
        }
    }

    private void desplazarMontana( int i) {
        for (int j = i; j < numeroMontana-1; j++) {
            this.montana[j]= this.montana[j+1];
        }
    }


}
