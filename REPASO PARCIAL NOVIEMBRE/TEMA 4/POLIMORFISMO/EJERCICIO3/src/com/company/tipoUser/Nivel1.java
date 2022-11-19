package com.company.tipoUser;

import com.company.User;

import java.net.UnknownServiceException;

public class Nivel1 extends User {

    private static String id= "common user";

    public Nivel1(String user, String password){
        super(user, password);
    }

    @Override
    public String toString() {
        return super.toString() + " "+id;
    }

    @Override
    public boolean esNivelIn() {
        return  true;
    }
}
