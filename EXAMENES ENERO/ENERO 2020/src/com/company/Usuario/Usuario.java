package com.company.Usuario;

import com.company.Comparadores.ComparadorTitulo;
import com.company.Excepciones.LimiteSuperadoException;
import com.company.tipoContenido.Contenido;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Usuario {

    private String mail;
    private String password;
    private Suscripcion suscripcion;
    private ArrayList<Contenido> listaContenido;
    int numeroDispositivos;

    public Usuario(String mail, String password, Suscripcion suscripcion){
        this.mail= mail;
        this.password= password;
        this.suscripcion= suscripcion;
        this.listaContenido= new ArrayList<>();
        this.numeroDispositivos=0;
    }

    public String toString(){
        Collections.sort(listaContenido, new ComparadorTitulo());
        return "USER ---> "+mail+ " "+suscripcion+"\n"+listaContenido;
    }

    public String getMail() {
        return mail;
    }

    public void addContenido(Contenido contenido){
        this.listaContenido.add(contenido);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(mail, usuario.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mail);
    }

    public ArrayList<Contenido> getListaContenido() {
        return listaContenido;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void addVisionado(Contenido contenido)throws LimiteSuperadoException{
        if (numeroDispositivos<suscripcion.getNumeroDevices()){
            numeroDispositivos++;
            if (!listaContenido.contains(contenido)){
                listaContenido.add(contenido);
            }
        }else {
            throw new LimiteSuperadoException();
        }
    }

    public void quitarDispositivos(){
        if (numeroDispositivos>0){
            numeroDispositivos--;
        }
    }

}
