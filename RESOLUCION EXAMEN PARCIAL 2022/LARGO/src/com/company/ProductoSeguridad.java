package com.company;


public abstract   class ProductoSeguridad {
    private double coste;
    private Fecha inicioContrato;
    private Fecha finContrato;

    public ProductoSeguridad(double coste, Fecha inicioContrato, Fecha finContrato) {
        this.coste = coste;
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
    }

    //los hago protected porque lo necesito usar para mis clases hijas y asi no se puede acceder a este metodo desde otra clase que no sea hija
    protected double getCoste() {
        return coste;
    }
    protected void setCoste(double coste) {
        this.coste = coste;
    }

    public String toString() {
        return "Inicio del contrato: " + this.inicioContrato + "\nFin del contrato: " + this.finContrato + "\n" + "\n"+this.coste;
    }

    public boolean fechaPosterior(Fecha fecha) {
        return this.inicioContrato.esDespuesA(fecha);
    }
}
