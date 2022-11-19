package com.company;

public abstract class User {

    private String usuario;
    private String password;

    public User (String usuario, String password){
        this.usuario= usuario;
        this.password= password;
    }

    public String toString(){
        return "user: "+this.usuario+" password: "+this.password;
    }

    public abstract boolean esNivelIn();

    protected String getPassword() {
        return password;
    }
}
