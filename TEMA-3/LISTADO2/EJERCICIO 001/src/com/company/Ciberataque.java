package com.company;

public class Ciberataque {

    private String nombre;
    private Fecha fechaCiberAtaque;

    public Ciberataque(String nombre, Fecha fechaCiberAtaque){
        this.nombre= nombre;
        this.fechaCiberAtaque= fechaCiberAtaque;
    }

    public String toString(){
        return this.nombre+" ---> "+this.fechaCiberAtaque;
    }


}
