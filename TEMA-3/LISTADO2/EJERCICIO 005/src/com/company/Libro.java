package com.company;

public class Libro {

    private String titulo;
    private Persona listado[];
    private int numeroAutores;
    private int isbn;
    private int paginas;
    private String editorial;
    private Fecha fecha;

    public Libro(String titulo, int isbn, int paginas, String editorial, Fecha fecha){
        this.titulo=titulo;
        this.isbn= isbn;
        this.paginas= paginas;
        this.editorial= editorial;
        this.fecha= fecha;
        this.numeroAutores= 0;
        this.listado= new Persona[10];
    }

    public void addAutor(Persona persona){
        if (numeroAutores< listado.length){
            listado[numeroAutores]= persona;
            numeroAutores++;
        }
    }

    public String toString(){
        String cadena= " ";
        for (int i = 0; i < numeroAutores; i++) {
            cadena= cadena +" "+ listado[i];
        }
        return titulo+ cadena + " "+fecha;
    }


    public boolean esAutor(Persona persona) {
        for (int i = 0; i < numeroAutores; i++) {
            if (listado[i].esAutor(persona)){
                return true;
            }
        }
        return false;
    }

    public boolean esYear(int year) {
        return fecha.esYear(year);
    }
}
