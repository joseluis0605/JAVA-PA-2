package com.company;

import com.company.generica.Corta;
import com.company.generica.Twitter;
import com.company.generica.corta.Extendida;

public class Main {

    public static void main(String[] args) {

        Catalogo catalogo= new Catalogo();

        GenericaNoticia genericaNoticia1= new GenericaNoticia(new Fecha(1,1,2020), "Noticias Sobre Ciberseguridad");

        Twitter twitter1= new Twitter(new Fecha(1,2,2020), "el #derbi fue una Batalla", "@joseluis");

        Corta corta1= new Corta(new Fecha(1,4,2019), "las Elecciones del proximo año pintan muy reñidas", "ELECCIONES 2023");

        Extendida extendida1= new Extendida(new Fecha(1,3,1999), "el MundIal empieza en catar en dos semanas", "ESPAÑA SE LA JUEGA");

        catalogo.addNoticia(genericaNoticia1);
        catalogo.addNoticia(twitter1);
        catalogo.addNoticia(corta1);
        catalogo.addNoticia(extendida1);

        //catalogo.mostrarTodo();

        //catalogo.mostrarFecha(new Fecha(1,2,2020));

        catalogo.keyWords();

        //genericaNoticia1.mostrarKey();
    }
}
