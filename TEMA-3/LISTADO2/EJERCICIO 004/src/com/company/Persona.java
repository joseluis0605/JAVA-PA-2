package com.company;

public class Persona {

    private String nombre;
    private String apellido;
    private Dni dni;
    private int edad;
    private int sueldo;
    private int horasExtras;

    public Persona(String nombre, String apellido, Dni dni, int edad, int sueldo){
        this.nombre= nombre;
        this.apellido= apellido;
        this.dni= dni;
        this.edad= edad;
        this.sueldo= sueldo;
        this.horasExtras=0;
    }

    public String toString(){
        return nombre+" "+apellido+" "+dni+" "+sueldo+" "+edad+" años "+horasExtras+" horas";
    }


    public boolean coincideDni(Dni dni) {
        return this.dni.mismoDni(dni);
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void addHoraExtra() {
        int aux= getHorasExtras();
        aux++;
        setHorasExtras(aux);
    }

    public boolean ganaMas(Persona persona) {
        return sueldo> persona.sueldo;
    }

    public boolean ganaMasDinero(int sueldo) {
        return this.sueldo> sueldo;
    }

    public boolean horaExtra() {
        return this.horasExtras>0;
    }

    public int getEdad() {
        return edad;
    }

    public boolean esMedia1() {
        return 18<=edad && edad<=25;
    }

    public boolean esMedia2() {
        return 26<=edad && edad<=35;
    }

    public boolean esMedia3() {
        return 36<=edad && edad<=45;
    }

    public boolean esMedia4() {
        return 45< edad;
    }
}
