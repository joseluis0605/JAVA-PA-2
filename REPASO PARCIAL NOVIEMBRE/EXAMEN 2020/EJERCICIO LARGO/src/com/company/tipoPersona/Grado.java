package com.company.tipoPersona;

import javax.print.DocFlavor;
import java.awt.font.TextHitInfo;

public enum Grado {


    CIBERSEGURIDAD ("Grado en Ingeniería de la Ciberseguridad"), INFORMATICA("Grado en Ingeniería Informática"), SOFTWARE("Grado en Ingeniería del Software"), COMPUTADORES("Grado en Ingeniería de Computadores "), VIDEOJUEGOS("Grado en Diseño y Desarrollo de Videojuegos.");

    private String grado;

    Grado(String grado){
        this.grado= grado;
    }

    public String toString(){
        return this.grado;
    }


}
