package com.company;

public class Generica {

    private Fecha fecha;
    private String resumen;

    public Generica(Fecha fecha, String resumen) {
        this.fecha = fecha;
        this.resumen = resumen;
        cambioResumen();
    }

    private void cambioResumen() {
        if (resumen.length()>280){
            this.resumen= resumen.substring(0-280);
        }
    }

    public String toString(){
        return "noticia generica con fecha: "+fecha+"\n"+resumen;
    }


    protected Fecha getFecha() {
        return fecha;
    }

    protected String getResumen() {
        return resumen;
    }

    public boolean mismaFecha(Fecha fecha) {
        return this.fecha.misma(fecha);
    }

    public boolean estaPalabra(String palabra) {
        return this.resumen.contains(palabra);
    }

    public void empiezaMayuscula() {
        //analizamos el resumen
        for (int i = 0; i < this.resumen.length(); i++) {
            char caracter= this.resumen.charAt(i);
            if (i==0 || (caracter>65 && caracter<=90)){
                int posicion= i;
                int posFinal= this.resumen.indexOf(" ", i);
                String cadena="";
                while (posicion< posFinal){
                    cadena= cadena+this.resumen.charAt(posicion);
                    posicion++;
                }
                System.out.println(cadena);
                i= posFinal+1;
            }
        }
    }

    public boolean esTwitter() {
        return false;
    }
}