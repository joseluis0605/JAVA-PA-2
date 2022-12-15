package com.company.amenaza;

import com.company.Dificultad;
import com.company.Urgencia;

import java.util.HashSet;
import java.util.Set;

public class Phishing extends Amenaza {

    private String mensaje;
    private Set<String> listadoUsuariosAfectados;
    private String informacionSacada;

    public Phishing(int id, String mensaje, String informacionSacada){
        super(id, Dificultad.BAJA, Urgencia.MEDIA);
        this.mensaje= mensaje;
        this.informacionSacada= informacionSacada;
        this.listadoUsuariosAfectados= new HashSet<>();
    }

    public String toString(){
        return "PHISHING.............\n"+super.toString()+mensaje+" "+informacionSacada+"\n"+"listado usuarios----> "+listadoUsuariosAfectados+"\n";
    }

    public void addUsuario(String nombre){
        listadoUsuariosAfectados.add(nombre);
        if (listadoUsuariosAfectados.size()>2){
            setUrgencia(Urgencia.ALTA);
        }
    }
}
