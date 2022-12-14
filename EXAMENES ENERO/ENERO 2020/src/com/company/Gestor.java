package com.company;

import com.company.Comparadores.ComparadorTitulo;
import com.company.Excepciones.NoValidEmailException;
import com.company.Usuario.Suscripcion;
import com.company.Usuario.Usuario;
import com.company.tipoContenido.Contenido;
import com.company.tipoContenido.tipoPelicula.Genero;
import com.company.tipoContenido.tipoPelicula.Pelicula;

import java.util.*;

public class Gestor {

    private Map<Genero, ArrayList<Pelicula>> mapaGenero;
    private Set<Contenido> setContenido;
    private Map<String, Usuario> mapaMail;
    private Map<Suscripcion, ArrayList<Usuario>> mapaSuscripcion;

    public Gestor(){
        this.mapaGenero= new HashMap<>();
        this.setContenido= new HashSet<>();
        this.mapaMail=new HashMap<>();
        this.mapaSuscripcion= new HashMap<>();
    }

    public void addContenido(Contenido contenido){
        if (contenido.esPelicula()){
            Pelicula pelicula= (Pelicula) contenido;
            ArrayList<Pelicula> listaAux= mapaGenero.get(pelicula.getGenero());
            if (listaAux==null){
                listaAux= new ArrayList<>();
                listaAux.add(pelicula);
                mapaGenero.put(pelicula.getGenero(), listaAux);
            }else {
                listaAux.add(pelicula);
                mapaGenero.put(pelicula.getGenero(), listaAux);
            }
        }
        setContenido.add(contenido);
    }

    public void mostrarContenido(){
        ArrayList<Contenido> lista= new ArrayList<>();
        lista.addAll(setContenido);
        Collections.sort(lista, new ComparadorTitulo());
        System.out.println(lista);
    }

    public void addUser(Usuario usuario) throws NoValidEmailException{
        String mail= usuario.getMail();
        if (mail.contains("@")){
            mapaMail.put(usuario.getMail(), usuario);

            ArrayList<Usuario> listaUser= mapaSuscripcion.get(usuario.getSuscripcion());
            if (listaUser==null){
                listaUser= new ArrayList<>();
                listaUser.add(usuario);
                mapaSuscripcion.put(usuario.getSuscripcion(), listaUser);
            }else {
                listaUser.add(usuario);
                mapaSuscripcion.put(usuario.getSuscripcion(), listaUser);
            }
        }else {
            throw new NoValidEmailException();
        }
    }

    public void addContenidoUsuario(Contenido contenido, Usuario usuario){
        if (mapaMail.get(usuario.getMail())!=null){
            usuario.addContenido(contenido);
            mapaMail.put(usuario.getMail(), usuario);
        }
    }

    public void mostrarUsuario(){
        for (Map.Entry<String, Usuario> valor : mapaMail.entrySet()){
            System.out.println(valor.getValue());
        }
    }

    public void deleteUser(String mail){
        mapaMail.remove(mail);
    }

    public void mostrarSuscripcion(Suscripcion suscripcion){
        System.out.println(mapaSuscripcion.get(suscripcion));
    }

    public void gestionMonetaria(){
        int contador= 0;
        for (Map.Entry<String, Usuario> valor : mapaMail.entrySet()){
            contador= contador + valor.getValue().getSuscripcion().getPrecio();
        }
        System.out.println("el precio total es: "+contador);
    }

}
