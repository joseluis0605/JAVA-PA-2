package com.company;

public class Main {

    public static void main(String[] args) {

        Serie serie= new Serie("serie1", 10);

        Capitulo capitulo1= new Capitulo("capitulo1", 100);
        Capitulo capitulo2= new Capitulo("capitulo2", 200);
        Capitulo capitulo3= new Capitulo("capitulo3", 300);
        Capitulo capitulo4= new Capitulo("capitulo4", 50);
        Capitulo capitulo5= new Capitulo("capitulo5", 60);
        Capitulo capitulo6= new Capitulo("capitulo6", 80);
        Capitulo capitulo7= new Capitulo("capitulo7", 70);
        Capitulo capitulo8= new Capitulo("capitulo8", 30);
        Capitulo capitulo9= new Capitulo("capitulo9", 40);
        Capitulo capitulo10= new Capitulo("capitulo10", 10);
        Capitulo capitulo11= new Capitulo("capitulo11", 20);

        Temporada temporada1= new Temporada(1, 2020, 5);
        Temporada temporada2= new Temporada(2, 2022, 5);


        temporada1.addCapitulo(capitulo1);
        temporada1.addCapitulo(capitulo2);
        temporada1.addCapitulo(capitulo3);
        temporada1.addCapitulo(capitulo4);
        temporada1.addCapitulo(capitulo5);
        temporada1.addCapitulo(capitulo6);
        temporada1.addCapitulo(capitulo7);

        temporada2.addCapitulo(capitulo8);
        temporada2.addCapitulo(capitulo9);
        temporada2.addCapitulo(capitulo10);
        temporada2.addCapitulo(capitulo11);

        serie.addTemporada(temporada1);
        serie.addTemporada(temporada2);

        //serie.mostrarSerie();

        serie.temporadaMasNumerosa();

        serie.mostrarMediaTemporada(1);



    }
}
