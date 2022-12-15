package com.company.hackers;

import com.company.Exceptions.NoHackerAvailableException;
import com.company.amenaza.Amenaza;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Hacker {
    private String id;
    private int maximoAmenazas;
    private int amenazasAtendidas;
    private Set<Amenaza> listadoAmenaza;

    public Hacker(String idPersonalEmpresa, int maximoAmenazas) {
        this.id = idPersonalEmpresa;
        this.maximoAmenazas = maximoAmenazas;
        this.amenazasAtendidas = 0;
        this.listadoAmenaza= new HashSet<>();
    }

    public String toString(){
        return id+"\n"+"listado amenazas---->"+listadoAmenaza+"\n";
    }

    public void addAmenaza(Amenaza amenaza) throws NoHackerAvailableException {
        this.listadoAmenaza.add(amenaza);
        amenazasAtendidas++;
    }

    protected int getAmenazasAtendidas() {
        return amenazasAtendidas;
    }

    protected int getMaximoAmenazas() {
        return maximoAmenazas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hacker hacker = (Hacker) o;
        return maximoAmenazas == hacker.maximoAmenazas && amenazasAtendidas == hacker.amenazasAtendidas && Objects.equals(id, hacker.id) && Objects.equals(listadoAmenaza, hacker.listadoAmenaza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maximoAmenazas, amenazasAtendidas, listadoAmenaza);
    }

    public abstract boolean puede(Amenaza amenaza);
}
