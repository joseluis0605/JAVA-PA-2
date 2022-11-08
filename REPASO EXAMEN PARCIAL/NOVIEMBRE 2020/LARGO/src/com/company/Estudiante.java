package com.company;

public class Estudiante extends Persona{

    private Grado grado;

    public Estudiante(String nombre, String apellido, String dni, int edad, Grado grado){
        super(nombre, apellido, dni, edad);
        this.grado= grado;
    }

    public String toString(){
        return super.toString()+" grado: "+this.grado;
    }

    @Override
    public boolean terminayear(int year) {
        return false;
    }

    @Override
    public boolean esSeccion(Seccion seccion) {
        return false;
    }

    @Override
    public boolean esCiber() {
        return this.grado.equals(Grado.CIBERSEGURIDAD);
    }

    @Override
    public boolean esInfor() {
        return grado.equals(Grado.INFORMATICA);
    }

    @Override
    public boolean esSoft() {
        return grado.equals(Grado.SOFTWARE);
    }

    @Override
    public boolean esComp() {
        return grado.equals(Grado.COMPUTADORES);
    }
}
