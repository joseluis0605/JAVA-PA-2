package com.company;
import java.util.Calendar;

public class Banco {

    private Persona listado[];
    private int numeroAsociados;

    public Banco(int tam){
        this.listado=new Persona[tam];
        this.numeroAsociados=0;
    }

    public void addPersona(Persona persona){
        if (numeroAsociados< listado.length){
            this.listado[numeroAsociados]= persona;
            numeroAsociados++;
        }
    }

    public void mostrarInfoBanco(){
        for (int i = 0; i < numeroAsociados; i++) {
            listado[i].mostrarPersona();
        }
    }

    public void numeroCuentasTotal(){
        int contador= 0;
        for (int i = 0; i < numeroAsociados; i++) {
            contador= contador + listado[i].getNumeroCuentas();
        }
        System.out.println("HAY UN TOTAL DE CUENTAS DE: "+contador);
    }

    public void mostrarDadoDNI(String dni){
        for (int i = 0; i < numeroAsociados; i++) {
            if (listado[i].coincideDNI(dni)){
                listado[i].mostrarPersona();
            }
        }
    }

    public void mostraFecha(Fecha fecha) {
        for (int i = 0; i < numeroAsociados; i++) {
            listado[i].esPosteriorFecha(fecha);
        }
    }

    public void darBaja(Cuenta cuenta, Persona persona) {
        for (int i = 0; i < numeroAsociados; i++) {
            if (listado[i].coincidePersona(persona)){
                listado[i].eliminarCuenta(cuenta);
            }
        }
    }

    public void hacerTransferencia(Persona persona, Cuenta cuentaOrige, Cuenta cuentaDestino, int cantidad){
        for (int i = 0; i < numeroAsociados; i++) {
            if (listado[i].coincidePersona(persona)){
                listado[i].probarTransferencia(cuentaDestino, cuentaOrige, cantidad);
            }
        }
    }
}
