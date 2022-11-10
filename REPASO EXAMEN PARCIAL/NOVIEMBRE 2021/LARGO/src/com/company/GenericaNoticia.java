package com.company;


public class GenericaNoticia {

    private Fecha fechaPublicacion;
    private String resumen;

    public GenericaNoticia(Fecha fecha, String resumen){
        this.fechaPublicacion= fecha;
        this.resumen= resumen;
        modificarResumen();
    }

    private void modificarResumen() {
        if (this.resumen.length()>80){
            String cadena= this.resumen.substring(0,80);
            setResumen(cadena);
        }

    }

    public String toString(){
        String cadena= "noticia generica publicada "+this.fechaPublicacion+"\n";
        cadena= cadena+this.resumen+"\n";
        cadena= cadena+"************************\n";
        return cadena;
    }

    protected Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }
    protected void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    protected String getResumen() {
        return resumen;
    }
    protected void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public boolean mismaFecha(Fecha fecha) {
        return this.fechaPublicacion.esMismaFecha(fecha);
    }

    public void mostrarKey() {
        for (int i = 0; i < this.resumen.length(); i++) {
            if (this.resumen.charAt(i)>=65 && this.resumen.charAt(i)<=90 ){
                String cadena = "";
                int indice=i;
                while (this.resumen.charAt(indice)!=' ' && !esFinal(indice)){
                    cadena= cadena+this.resumen.charAt(indice);
                    indice++;
                    if (esFinal(indice)){
                        cadena= cadena+this.resumen.charAt(this.resumen.length()-1);
                    }
                }
                i= indice;
                System.out.println(cadena);
            }
        }
    }

    private boolean esFinal(int indice) {
        return indice==this.resumen.length()-1;
    }
}
