package com.company.clasesProporcionadas;


import java.util.Objects;

public class ProductoSeguridad {
    private double coste;
    private Fecha inicioContrato;
    private Fecha finContrato;

    public ProductoSeguridad(double coste, Fecha inicioContrato, Fecha finContrato) {
        this.coste = coste;
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
    }





    @Override
    public String toString() {
        return "Inicio del contrato: " + this.inicioContrato + "\nFin del contrato: " + this.finContrato +"\n"+this.coste;
    }

    //SETTER GETTER AND EQUAL

    protected void setCoste(double coste) {
        this.coste = coste;
    }

    protected double getCoste() {
        return coste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoSeguridad that = (ProductoSeguridad) o;
        return Double.compare(that.coste, coste) == 0 && Objects.equals(inicioContrato, that.inicioContrato) && Objects.equals(finContrato, that.finContrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coste, inicioContrato, finContrato);
    }
}
