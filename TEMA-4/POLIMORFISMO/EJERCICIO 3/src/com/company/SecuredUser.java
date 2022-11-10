package com.company;

public class SecuredUser extends Usuario{

    private String tipoSeguridad= "Secured";
    public SecuredUser(String usuario, String pass){
        super(usuario,pass);
    }

    @Override
    public String toString() {
        return super.toString() +" tipoSeguridad='" + tipoSeguridad;
    }

    @Override
    public boolean esSecured() {
        return true;
    }

    @Override
    public boolean validar() {
        boolean numero=false;
        boolean letra=false;
        String pass= getPassword();
        for (int i = 0; i < getPassword().length(); i++) {
            if (esNumero(pass.charAt(i))){
                numero=true;
            }
            if (esLetra(pass.charAt(i))){
                letra=true;
            }
        }
        return numero&&letra;
    }

    private boolean esLetra(char charAt) {
        return (charAt>=65 && charAt<=90) || (charAt>=97 && charAt<=122);
    }

    private boolean esNumero(char charAt) {
        return charAt<=57 && charAt>=48;
    }

}
