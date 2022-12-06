package com.company;

import java.util.Objects;

public class Usuario {

    private String nick;
    private int ganadas;
    private int jugadas;

    public Usuario(String nick, int ganadas, int jugadas){
        this.nick=nick;
        this.ganadas= ganadas;
        this.jugadas= jugadas;
    }

    @Override
    public String toString() {
        return nick+" wins "+ganadas+" total "+jugadas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return nick.equals(usuario.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick);
    }

    public int getGanadas() {
        return ganadas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public String getNick() {
        return nick;
    }
}
