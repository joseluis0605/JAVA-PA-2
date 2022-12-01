package com.company;

public class Generica {

    private Fecha fecha;
    private String resumen;

    public Generica(Fecha fecha, String resumen){
        this.fecha=fecha;
        this.resumen=resumen;
        ajustarResumen();
    }

    private void ajustarResumen() {
        if (this.resumen.length()>280){
            this.resumen=this.resumen.substring(0,280);
        }
    }

    public String toString(){
        return this.resumen+" "+fecha;
    }

    protected String getResumen() {
        return resumen;
    }

    public boolean mismaFecha(Fecha fecha) {
        return this.fecha.misma(fecha);
    }

    public boolean mismoTema(String tema) {
        return this.resumen.contains(tema);
    }

    public boolean esCorta() {
        return false;
    }
}
