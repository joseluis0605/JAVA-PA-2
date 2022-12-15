package com.company.amenaza;

import com.company.Dificultad;
import com.company.Urgencia;

import java.util.HashSet;
import java.util.Set;

public class DenegacionServicio extends Amenaza {

    private String servidor;
    private int puerto;
    private Set<String> ip;

    public DenegacionServicio(int id, String servidor, int puerto){
        super(id, Dificultad.BAJA ,Urgencia.ALTA);
        this.servidor= servidor;
        this.puerto=puerto;
        this.ip= new HashSet<>();
    }

    public String toString(){
        return "DENEGACION DE SERVICIOS.............\n"+super.toString()+servidor+" "+puerto+"\n"+"listado ip----> "+ip+"\n";
    }

    public void addIp(String ip){
        this.ip.add(ip);
        modificarInfo();
    }

    private void modificarInfo() {
        if (this.ip.size()>5){
            setDificultad(Dificultad.ALTA);
        }else if (this.ip.size()>2){
            setDificultad(Dificultad.MEDIA);
        }else {
            setDificultad(Dificultad.BAJA);
        }
    }
}
