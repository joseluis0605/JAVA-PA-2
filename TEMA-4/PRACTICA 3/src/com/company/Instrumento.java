package com.company;

public class Instrumento {

    private TipoInstrumento tipoInstrumento;
    private String marca;
    private int precio;
    private String rebajado;
    private int precioRebajado;

    public Instrumento(TipoInstrumento tipoInstrumento, String marca, int precio){
        this.marca= marca;
        this.tipoInstrumento= tipoInstrumento;
        this.precio= precio;
        this.rebajado="no";
        this.precioRebajado=0;
    }

    public void rebajar(int porcentaje){
        precioRebajado= precio*porcentaje/100;
        rebajado="si";
    }

    public String toString(){
        String cadena=  "tipo: "+this.tipoInstrumento+" marca: "+this.marca+" rebajado: "+this.rebajado+" precio: "+this.precio;
        if (this.rebajado.equals("si")){
            cadena= cadena+" precio rebajado: "+this.precioRebajado;
        }
        return cadena;
    }

    protected TipoInstrumento getTipoInstrumento() {
        return tipoInstrumento;
    }
    protected void setTipoInstrumento(TipoInstrumento tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }
    protected String getMarca() {
        return marca;
    }
    protected void setMarca(String marca) {
        this.marca = marca;
    }
    protected int getPrecio() {
        return precio;
    }
    protected void setPrecio(int precio) {
        this.precio = precio;
    }
    protected String getRebajado() {
        return rebajado;
    }
    protected void setRebajado(String rebajado) {
        this.rebajado = rebajado;
    }
    protected int getPrecioRebajado() {
        return precioRebajado;
    }
    protected void setPrecioRebajado(int precioRebajado) {
        this.precioRebajado = precioRebajado;
    }

    public boolean estaRebajado() {
        return this.rebajado.equals("si");
    }
}
