package com.company.amenaza;

import com.company.Dificultad;
import com.company.Urgencia;
import com.company.hackers.Hacker;

import java.util.Objects;

public abstract class Amenaza {

    private int id;
    private Urgencia urgencia;
    private Dificultad dificultad;


    public Amenaza(int id, Dificultad dificultad, Urgencia urgencia){
        this.id=id;
        this.dificultad=dificultad;
        this.urgencia= urgencia;

    }

    public String toString(){
        return "id --> "+id+" "+dificultad+" "+urgencia+"\n";
    }

    protected void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public void setUrgencia(Urgencia urgencia) {
        this.urgencia = urgencia;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public Urgencia getUrgencia() {
        return urgencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amenaza amenaza = (Amenaza) o;
        return id == amenaza.id && urgencia == amenaza.urgencia && dificultad == amenaza.dificultad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, urgencia, dificultad);
    }
}
