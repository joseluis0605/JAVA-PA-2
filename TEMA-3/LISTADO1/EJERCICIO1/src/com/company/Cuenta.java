package com.company;
import java.util.Calendar;

public class Cuenta {

    private int numeroCuenta;
    private int saldo;
    private Fecha fecha;

    public Cuenta(int numeroCuenta, int saldo, Fecha fecha){
        this.numeroCuenta=numeroCuenta;
        this.saldo= saldo;
        this.fecha= fecha;
    }

    public String toString(){
        return "Numero de cuenta: "+numeroCuenta+" y tiene: "+saldo;
    }


    public boolean mostrarPosterior(Fecha fecha) {
        return this.fecha.esPosterior(fecha);
    }

    public boolean esCuenta(Cuenta cuenta) {
        return this.numeroCuenta==cuenta.numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void quitar(int cantidad) {
        this.saldo= this.saldo-cantidad;
    }

    public void addCantidad(int cantidad) {
        this.saldo= this.saldo+cantidad;
    }
}
