package com.company;

import java.util.Objects;

public class Alumno {

    private String nombre;
    private String nacionalidad;
    private String sexo;
    private int expediente;

    public Alumno(String nombre, String nacionalidad, String sexo, int expediente){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
        this.expediente= expediente;
        this.sexo= sexo;
    }

    public String toString(){
        return nombre+" "+nacionalidad+" "+sexo+" expediente: "+expediente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return expediente == alumno.expediente && Objects.equals(nombre, alumno.nombre) && Objects.equals(nacionalidad, alumno.nacionalidad) && Objects.equals(sexo, alumno.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nacionalidad, sexo, expediente);
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getExpediente() {
        return expediente;
    }
}
