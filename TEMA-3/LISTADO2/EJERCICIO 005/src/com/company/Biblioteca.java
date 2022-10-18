package com.company;

import javax.swing.*;

public class Biblioteca {

    private Libro catalogo[];
    private int numeroLibros;

    public Biblioteca(){
        this.catalogo= new Libro[10];
        this.numeroLibros=0;
    }

    public void mostrarLibros(){
        for (int i = 0; i < numeroLibros; i++) {
            System.out.println(catalogo[i]);
        }
    }

    public void addLibro(Libro libro){
        if (numeroLibros< catalogo.length){
            catalogo[numeroLibros]= libro;
            numeroLibros++;
        }
    }

    private int getNumeroLibros() {
        return numeroLibros;
    }

    public void numeroLibros(){
        System.out.println("numero libros totales: "+getNumeroLibros());
    }

    public void buscarAutor(Persona persona){
        for (int i = 0; i < numeroLibros; i++) {
            if (catalogo[i].esAutor(persona)){
                System.out.println(catalogo[i]);
            }
        }
    }

    public void mostrarYear(int year){
        for (int i = 0; i < numeroLibros; i++) {
            if (catalogo[i].esYear(year)){
                System.out.println(catalogo[i]);
            }
        }
    }
}
