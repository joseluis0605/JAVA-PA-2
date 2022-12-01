package com.company.tipoGenerica;


import com.company.Fecha;
import com.company.Generica;

public class Twitter extends Generica {

    private String user;

    public Twitter(Fecha fecha, String resumen, String user){
        super(fecha, resumen);
        this.user= user;
    }

    public String toString(){
        return "Tweet con fecha: "+getFecha()+"del usuario "+user+"\n"+getResumen();
    }

    @Override
    public boolean esTwitter() {
        return true;
    }
}
