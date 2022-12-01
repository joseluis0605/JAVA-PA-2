package com.company;



public class Contrato {

    // Fecha de solicitud, pero no tiene por qué coincidir con la fecha de inicio del
    // producto que se contrata
    private Fecha fechaSolicitudProducto;
    private Cliente cliente;
    private ProductoSeguridad producto;

    public Contrato(Fecha fechaSolicitudProducto, Cliente c, ProductoSeguridad producto) {
        this.fechaSolicitudProducto = fechaSolicitudProducto;
        this.cliente = c;
        this.producto = producto;
    }

    public String toString() {
        return "********************\nSolicitud de contrato: " + this.fechaSolicitudProducto + "\n" +
                this.cliente + "\n" +
                this.producto+"\n********************";
    }


    public boolean eresPersona(String dni) {
        return this.cliente.coincideDNI(dni);
    }

    public boolean eresPosterior(Fecha fecha) {
        return this.producto.fechaPosterior(fecha);
    }
}
