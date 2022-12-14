package com.company.tipoContenido.tipoDocumental;

import com.company.tipoContenido.Contenido;

public class Documental extends Contenido {

    private boolean hechoReal;

    public Documental(String titulo, int duracion, boolean hechoReal){
        super(titulo, duracion);
        this.hechoReal= hechoReal;
    }

    public String toString(){
        return "DOCUMENTAL: "+super.toString()+" hecho real: "+hechoReal+"\n";
    }

}
