package com.company.tipoUser;

import com.company.User;

public class Nivel3 extends User {

    private static String id= "super secured user";

    public Nivel3(String user, String password){
        super(user, password);
    }

    @Override
    public String toString() {
        return super.toString()+ " "+id;
    }

    @Override
    public boolean esNivelIn() {
        boolean number= false;
        boolean carac= false;
        int tam= getPassword().length();
        for (int i = 0; i <tam ; i++) {
            char caracter= getPassword().charAt(i);
            if (caracter>=48 && caracter<=57){
                number= true;
            }

            if (caracter<47 || caracter>122){
                carac= true;
            }
        }
        return number && carac;
    }
}
