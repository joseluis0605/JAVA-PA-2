package com.company;

public abstract class Usuario {

    private String usuario;
    private String password;

    public Usuario(String usuario, String password){
        this.usuario= usuario;
        this.password= password;
    }

    public String toString(){
        return "usuario "+usuario+" contraseña "+password;
    }

    public boolean esCommon() {
        return false;
    }

    public boolean esSecured() {
        return false;
    }

    public boolean esSuperSecured() {
        return false;
    }

    public abstract boolean validar();

    protected String getPassword() {
        return password;
    }
}
