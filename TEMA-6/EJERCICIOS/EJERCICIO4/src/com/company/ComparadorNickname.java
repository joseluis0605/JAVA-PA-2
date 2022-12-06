package com.company;

import java.util.Comparator;

public class ComparadorNickname implements Comparator<Usuario> {
    @Override
    public int compare(Usuario o1, Usuario o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
