package com.company;

import com.company.tipoGenerica.Cortas;
import com.company.tipoGenerica.Twitter;
import com.company.tipoGenerica.tipoCorta.Extendida;
import com.company.tipoGenerica.tipoCorta.Parrafo;

public class Main {

    public static void main(String[] args) {

        Gestor gestor= new Gestor();

        Generica generica= new Generica(new Fecha(1,2,2020), "Cibersecurity News");

        Twitter twitter= new Twitter(new Fecha(2,6,2021), "La financiera #robinhood ha sufrido el robo de sus datos","@joseluis");

        Cortas cortas= new Cortas(new Fecha(5,9,2022),"Lolvemos con las amenanzas  de soto en los Comentarios de las noticias cortas", "SOTO VUELVE A LAS ANDADAS");

        Extendida extendida= new Extendida(new Fecha(3,6,2022), "Esto es una Noticia larga con parrafos de robo ", "examen parcial de PA");
        extendida.addParrafo(new Parrafo("parrafo1"));
        extendida.addParrafo(new Parrafo("parrafo2"));
        extendida.addParrafo(new Parrafo("parrafo3"));
        extendida.addParrafo(new Parrafo("parrafo4"));


        gestor.addNoticia(generica);
        gestor.addNoticia(twitter);
        gestor.addNoticia(cortas);
        gestor.addNoticia(extendida);

        //gestor.mostrarTodas();

        //gestor.mostrarFecha(new Fecha(2,3,2022));

        gestor.mostrarPalabra(" robo ");

        gestor.mostrarKeywords();



    }
}
