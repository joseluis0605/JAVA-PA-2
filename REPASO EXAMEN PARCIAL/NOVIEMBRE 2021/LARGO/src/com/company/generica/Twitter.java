package com.company.generica;

import com.company.Fecha;
import com.company.GenericaNoticia;

import java.awt.font.TextHitInfo;

public class Twitter extends GenericaNoticia {

    private String usuario;

    public Twitter(Fecha fecha, String resumen, String usuario){
        super(fecha, resumen);
        this.usuario= usuario;
    }

    public String toString(){
        String cadena= "tweet de "+this.usuario+"el dia: "+getFechaPublicacion()+"\n";
        cadena= cadena+this.getResumen()+"\n";
        cadena= cadena+"************************\n";

        return cadena;
    }
}
