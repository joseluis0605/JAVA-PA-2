package com.company.clasesProporcionadas;


import java.util.ArrayList;
import java.util.Objects;

public class Contrato {

    // Fecha de solicitud, pero no tiene por qué coincidir con la fecha de inicio del
    // producto que se contrata
    private Fecha fechaSolicitudProducto;
    private Cliente cliente;
    private ArrayList<ProductoSeguridad> listaProductosContratado;

    public Contrato(Fecha fechaSolicitudProducto, Cliente c, ProductoSeguridad producto) {
        this.fechaSolicitudProducto = fechaSolicitudProducto;
        this.cliente = c;
        this.listaProductosContratado= new ArrayList<>();
    }

    public void addProducto(ProductoSeguridad productoSeguridad){
        if (!listaProductosContratado.contains(productoSeguridad)){
            listaProductosContratado.add(productoSeguridad);
        }
    }


    public String toString() {
        return "********************\nSolicitud de contrato: " + this.fechaSolicitudProducto + "\n" +
                this.cliente + "\n" +
                this.listaProductosContratado+"\n********************";
    }

    //GETTER SETTER AND EQUALS


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contrato contrato = (Contrato) o;
        return Objects.equals(fechaSolicitudProducto, contrato.fechaSolicitudProducto) && Objects.equals(cliente, contrato.cliente) && Objects.equals(listaProductosContratado, contrato.listaProductosContratado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaSolicitudProducto, cliente, listaProductosContratado);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean eresDespuesDe(Fecha fecha) {
        return this.fechaSolicitudProducto.after(fecha);
    }
}
