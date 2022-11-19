package com.company;

public abstract class Instrumento {

    private String marca;
    private Tipo tipoInstrumento;
    private int precioBase;
    private String rebajado;
    private int precioRebajado;

    public Instrumento(String marca, Tipo tipoInstrumento, int precioBase){
        this.marca= marca;
        this.tipoInstrumento= tipoInstrumento;
        this.precioBase=precioBase;
        this.rebajado= "no";
        this.precioRebajado=0;
    }

    @Override
    public String toString() {
        String cadena= "tipo: "+tipoInstrumento+" marca: "+marca+" precio base: "+precioBase;
        if (this.rebajado.equals("si")){
            cadena= cadena+" rebajado: "+this.rebajado+" precio rebajado: "+precioRebajado;
        }
        return cadena;
    }

    protected String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected Tipo getTipoInstrumento() {
        return tipoInstrumento;
    }

    protected void setTipoInstrumento(Tipo tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    protected int getPrecioBase() {
        return precioBase;
    }

    protected void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
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

    public boolean eresEste(Instrumento instrumento) {
        return this.marca.equalsIgnoreCase(instrumento.marca) && this.tipoInstrumento.equals(instrumento.tipoInstrumento);
    }

    public void aplicarDescuento(int tanto) {
        this.rebajado="si";
        this.precioRebajado= this.precioBase*tanto/100;
    }

    public boolean esViento() {
        return false;
    }

    public boolean estasRebajado() {
        return this.rebajado.equalsIgnoreCase("si");
    }
}
