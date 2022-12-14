package com.company;


import com.company.Excepciones.NoSuchSeasonException;
import com.company.Excepciones.NoValidEmailException;
import com.company.Usuario.Suscripcion;
import com.company.Usuario.Usuario;
import com.company.tipoContenido.tipoDocumental.Documental;
import com.company.tipoContenido.tipoPelicula.Genero;
import com.company.tipoContenido.tipoPelicula.Pelicula;
import com.company.tipoContenido.tipoSerie.Capitulo;
import com.company.tipoContenido.tipoSerie.Serie;
import com.company.tipoContenido.tipoSerie.Temporada;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Serie serie1= new Serie("serie1");

        Capitulo capitulo1= new Capitulo(10);
        Capitulo capitulo2= new Capitulo(10);
        Capitulo capitulo3= new Capitulo(10);
        Capitulo capitulo4= new Capitulo(10);
        Capitulo capitulo5= new Capitulo(10);

        serie1.addTemporada(1);
        serie1.addTemporada(2);

        try {
            serie1.addCapituloTemporada(1, capitulo1);
            serie1.addCapituloTemporada(1, capitulo2);
            serie1.addCapituloTemporada(2, capitulo3);
            serie1.addCapituloTemporada(2, capitulo4);
            serie1.addCapituloTemporada(2, capitulo5);
        }catch (NoSuchSeasonException e){
            System.out.println("ERROR");
        }



        Pelicula pelicula= new Pelicula("iron man", 20, Genero.acción);
        Pelicula pelicula1= new Pelicula("ant man", 20, Genero.acción);
        Pelicula pelicula2= new Pelicula("capitan america", 20, Genero.acción);
        Pelicula pelicula3= new Pelicula("end game", 20, Genero.comedia);

        Documental documental= new Documental("arañas" , 35, true);

        Gestor gestor= new Gestor();

        gestor.addContenido(pelicula);
        gestor.addContenido(pelicula1);
        gestor.addContenido(pelicula2);
        gestor.addContenido(pelicula3);
        gestor.addContenido(documental);
        gestor.addContenido(serie1);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Usuario usuario= new Usuario("pedro@gmail.com", "1234", Suscripcion.HD);
        Usuario usuario1= new Usuario("luis@gmail.com", "1234", Suscripcion.UHD);
        Usuario usuario2= new Usuario("carlos@gmail.com", "1234", Suscripcion.SD);

        try {
            gestor.addUser(usuario);
            gestor.addUser(usuario1);
            gestor.addUser(usuario2);
        }catch (NoValidEmailException e){
            System.out.println("ERROR");
        }

        gestor.addContenidoUsuario(pelicula, usuario);
        gestor.addContenidoUsuario(pelicula1, usuario);
        gestor.addContenidoUsuario(pelicula2, usuario);
        gestor.addContenidoUsuario(documental, usuario1);
        gestor.addContenidoUsuario(serie1, usuario2);
        //gestor.mostrarUsuario();
        //gestor.deleteUser("pedro@gmail.com");
        //gestor.mostrarSuscripcion(Suscripcion.UHD);

        gestor.gestionMonetaria();
    }
}
