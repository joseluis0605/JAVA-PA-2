package com.company;

public class Corta extends Generica{

    private String titular;

    public Corta(Fecha fecha, String resumen, String titular){
        super(fecha, resumen);
        this.titular= titular;
    }

    public String toString(){
        return "titular "+titular+"\n"+super.toString();
    }

    @Override
    public boolean mismoTema(String tema) {
        return super.mismoTema(tema) || this.titular.contains(tema);
    }

    @Override
    public boolean esCorta() {
        return true;
    }
}
