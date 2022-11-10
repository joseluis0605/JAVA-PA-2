package com.company;

public class Gestor {

    private Usuario listado[];
    private int numeroCuentas;

    public Gestor(){
        this.listado= new Usuario[10];
        this.numeroCuentas=0;
    }

    public void addCuenta(Usuario usuario){

        if (usuario.esCommon()){
            if (usuario.validar()){
                listado[numeroCuentas]=usuario;
                numeroCuentas++;
            }
        }else if (usuario.esSecured()){
            if (usuario.validar()){
                listado[numeroCuentas]=usuario;
                numeroCuentas++;
            }

        }else if (usuario.esSuperSecured()){
            if (usuario.validar()){
                listado[numeroCuentas]=usuario;
                numeroCuentas++;
            }

        }else {
            System.out.println("error al introducir el tipo de usuario");
        }
    }

    public void mostrar(){
        for (int i = 0; i < numeroCuentas; i++) {
            System.out.println("*************************");
            System.out.println(listado[i]);
        }
    }
}
