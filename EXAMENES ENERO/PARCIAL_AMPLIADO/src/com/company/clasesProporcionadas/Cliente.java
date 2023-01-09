package com.company.clasesProporcionadas;

import java.util.Objects;

public class Cliente {
    private String dni;
    private String nombre_apellidos;
    private String direccion;

    public Cliente(String dni, String nombre_apellidos, String direccion) {
        this.dni = dni;
        this.nombre_apellidos = nombre_apellidos;
        this.direccion = direccion;
    }



    public String toString() {
        return this.nombre_apellidos + ", con dni " + this.dni;
    }

    public String getNombre_apellidos() {
        return nombre_apellidos;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(dni, cliente.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
