package com.company;

public class CommonUser extends Usuario{

    private String tipoSeguridad= "common";

    public CommonUser(String usuario, String password){
        super(usuario, password);
    }

    public String toString() {
        return super.toString() +" tipoSeguridad='" + tipoSeguridad;
    }

    @Override
    public boolean esCommon() {
        return true;
    }

    @Override
    public boolean validar() {
        return true;
    }
}
