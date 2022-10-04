package com.company;
import java.util.Calendar;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private Cuenta listado[];
    private int numeroCuentas;

    public Persona(String nombre, String apellido, String dni){
        this.nombre= nombre;
        this.apellido= apellido;
        this.dni= dni;
        this.listado= new Cuenta[10];
        numeroCuentas=0;
    }

    public void addCuenta(Cuenta cuenta){
        if (numeroCuentas<listado.length){
            listado[numeroCuentas]= cuenta;
            numeroCuentas++;
        }
    }

    public void mostrarPersona(){
        System.out.println("INFORMACION SOBRE "+nombre+" "+apellido+" "+dni);
        for (int i = 0; i < numeroCuentas; i++) {
            System.out.println(listado[i]);
        }
    }

    public int getNumeroCuentas() {
        return numeroCuentas;
    }

    public boolean coincideDNI(String dni) {
        return this.dni.equals(dni);
    }


    public void esPosteriorFecha(Fecha fecha) {
        for (int i = 0; i < numeroCuentas; i++) {
            if (listado[i].mostrarPosterior(fecha)){
                System.out.println("INFORMACION SOBRE "+nombre+" "+apellido+" "+dni);
                System.out.println(listado[i]);
            }
        }
    }

    public boolean coincidePersona(Persona persona) {
        return this.dni.equals(persona.dni);
    }

    public void eliminarCuenta(Cuenta cuenta) {
        for (int i = 0; i < numeroCuentas; i++) {
            if (listado[i].esCuenta(cuenta)){
                movemosListadoCuentas(i);
            }
        }
    }

    private void movemosListadoCuentas(int i) {
        for (int j = i; j < numeroCuentas-1; j++) {
            listado[j]=listado[j+1];
        }
        numeroCuentas--;
    }

    public void probarTransferencia(Cuenta cuentaDestino, Cuenta cuentaOrige, int cantidad) {
        boolean existeOrigen= false;
        int indexOrigen = -1;
        int indexDestino;
        boolean existeDestino= false;
        for (int i = 0; i < numeroCuentas; i++) {
            if (listado[i].esCuenta(cuentaOrige)){
                existeOrigen= true;
                indexOrigen=i;
                listado[i].quitar(cantidad);
            }
            if (listado[i].esCuenta(cuentaDestino) && existeOrigen){
                existeDestino= true;
                indexDestino= i;
                listado[i].addCantidad(cantidad);
            }
        }

        if (!existeDestino && indexOrigen!=-1){
            listado[indexOrigen].addCantidad(cantidad);
        }


    }
}
