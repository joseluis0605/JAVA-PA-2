package com.company;

public class Main {

    public static void main(String[] args) {

        Gestor gestor= new Gestor();

        SecuredUser securedUser1= new SecuredUser("joseluis", "hola");
        SecuredUser securedUser2= new SecuredUser("teresa", "hola1");

        CommonUser commonUser1= new CommonUser("nandez", "asdf");

        SuperSecuredUser superSecuredUser1= new SuperSecuredUser("mario", "hola");
        SuperSecuredUser superSecuredUser2= new SuperSecuredUser("jorge", "asd45!!");

        gestor.addCuenta(securedUser1);
        gestor.addCuenta(securedUser2);

        gestor.addCuenta(commonUser1);

        gestor.addCuenta(superSecuredUser1);
        gestor.addCuenta(superSecuredUser2);

        gestor.mostrar();


    }
}
