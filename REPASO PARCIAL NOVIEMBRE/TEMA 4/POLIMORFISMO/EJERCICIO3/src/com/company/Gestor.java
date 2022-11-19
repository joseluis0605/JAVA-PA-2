package com.company;

public class Gestor {

    private User listado[];
    private int numeroUsers;

    public Gestor(){
        this.listado= new User[10];
        this.numeroUsers=0;
    }

    public void addUser(User user){
        if (user.esNivelIn() && numeroUsers< listado.length){
            listado[numeroUsers]=user;
            numeroUsers++;
        }
    }

    public void mostrarTodo(){
        for (int i = 0; i < numeroUsers; i++) {
            System.out.println(listado[i]);
        }
    }
}
