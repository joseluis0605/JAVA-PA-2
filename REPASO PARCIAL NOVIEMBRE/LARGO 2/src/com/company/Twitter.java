package com.company;

public class Twitter extends Generica{

    private String usuario;

    public Twitter(Fecha fecha, String resumen, String usuario){
        super(fecha, resumen);
        this.usuario=usuario;
    }

    public String toString(){
        return "tweet by "+usuario+"\n"+super.toString();
    }
}
