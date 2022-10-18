package com.company;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca= new Biblioteca();

        Persona persona1= new Persona("nombre1", "apellido1");
        Persona persona2= new Persona("nombre2", "apellido2");
        Persona persona3= new Persona("nombre3", "apellido3");
        Persona persona4= new Persona("nombre4", "apellido4");
        Persona persona5= new Persona("nombre5", "apellido5");
        Persona persona6= new Persona("nombre6", "apellido6");
        Persona persona7= new Persona("nombre7", "apellido7");
        Persona persona8= new Persona("nombre8", "apellido8");
        Persona persona9= new Persona("nombre9", "apellido9");

        Libro libro1= new Libro("titulo1", 1, 100, "ed1", new Fecha(2000));
        Libro libro2= new Libro("titulo2", 2, 150, "ed2", new Fecha(2001));
        Libro libro3= new Libro("titulo3", 3, 200, "ed3", new Fecha(2010));
        Libro libro4= new Libro("titulo4", 4, 180, "ed1", new Fecha(2020));
        Libro libro5= new Libro("titulo5", 5, 120, "ed2", new Fecha(2022));
        Libro libro6= new Libro("titulo6", 6, 110, "ed3", new Fecha(2020));
        Libro libro7= new Libro("titulo7", 7, 350, "ed1", new Fecha(2017));
        Libro libro8= new Libro("titulo8", 8, 600, "ed1", new Fecha(2016));

        libro1.addAutor(persona1);
        libro1.addAutor(persona2);
        libro1.addAutor(persona3);
        libro2.addAutor(persona4);
        libro2.addAutor(persona5);
        libro2.addAutor(persona6);
        libro3.addAutor(persona7);
        libro4.addAutor(persona8);
        libro5.addAutor(persona9);
        libro6.addAutor(persona3);
        libro7.addAutor(persona4);
        libro8.addAutor(persona5);
        libro1.addAutor(persona6);

        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro3);
        biblioteca.addLibro(libro4);
        biblioteca.addLibro(libro5);
        biblioteca.addLibro(libro6);
        biblioteca.addLibro(libro7);
        biblioteca.addLibro(libro8);

        biblioteca.mostrarLibros();
        biblioteca.numeroLibros();
        biblioteca.buscarAutor(persona5);
        biblioteca.mostrarYear(2020);
    }
}
