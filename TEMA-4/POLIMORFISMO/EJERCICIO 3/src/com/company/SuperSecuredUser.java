package com.company;

public class SuperSecuredUser extends Usuario{

    private String tipoSeguridad= "superSecured";
    public SuperSecuredUser(String usuario, String password){
        super(usuario, password);
    }

    public String toString() {
        return super.toString() +" tipoSeguridad='" + tipoSeguridad;
    }

    @Override
    public boolean esSuperSecured() {
        return true;
    }

    @Override
    public boolean validar() {
        boolean numero=false;
        boolean letra=false;
        boolean caracter= false;
        String pass= getPassword();
        for (int i = 0; i < getPassword().length(); i++) {
            if (esNumero(pass.charAt(i))){
                numero=true;
            }
            if (esLetra(pass.charAt(i))){
                letra=true;
            }
            if (esCaracter(pass.charAt(i))){
                caracter= true;
            }
        }
        return numero&&letra&&caracter;
    }

    private boolean esCaracter(char charAt) {
        return charAt<47 || charAt>122;
    }

    private boolean esLetra(char charAt) {
        return (charAt>=65 && charAt<=90) || (charAt>=97 && charAt<=122);
    }

    private boolean esNumero(char charAt) {
        return charAt<=57 && charAt>=48;
    }
}
