package com.company.amenaza;

import com.company.Dificultad;
import com.company.Urgencia;

import java.util.ArrayList;

public class MITM extends Amenaza {

    private String origen;
    private String destino;
    private String suplantador;
    private ArrayList<String> listaMensajes;

    public MITM(int id, String origen, String destino, String suplantador){
        super(id, Dificultad.MEDIA, Urgencia.MEDIA);
        this.origen=origen;
        this.destino=destino;
        this.suplantador= suplantador;
        this.listaMensajes= new ArrayList<>();
    }

    public String toString(){
        return "MAN IN THE MIDDLE.............\n"+super.toString()+origen+" "+destino+" "+suplantador+"\n"+"listado mensajes----> "+listaMensajes+"\n";
    }

    public void addMensaje(String mensaje){
        listaMensajes.add(mensaje);
        modificarInfo();
    }

    private void modificarInfo() {
        if (listaMensajes.size()>10){
            setUrgencia(Urgencia.ALTA);
        }
    }
}
