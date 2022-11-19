package com.company;

import com.company.tipoUser.Nivel1;
import com.company.tipoUser.Nivel2;
import com.company.tipoUser.Nivel3;

public class Main {

    public static void main(String[] args) {


        Gestor gestor= new Gestor();

        Nivel1 nivel1= new Nivel1("jose luis", "ASDFASDF");

        Nivel2 nivel21= new Nivel2("teresa", "ASDFASD");
        Nivel2 nivel22= new Nivel2("teresa", "12344ASDF");

        Nivel3 nivel31= new Nivel3("teresa", "ASDF234234");
        Nivel3 nivel32= new Nivel3("teresa", "12AGSDF@22¿¿¿¿¿¿¿¿¡¡¡¡¡¡¡344");


        gestor.addUser(nivel1);
        gestor.addUser(nivel21);
        gestor.addUser(nivel22);
        gestor.addUser(nivel31);
        gestor.addUser(nivel32);

        gestor.mostrarTodo();


    }
}
