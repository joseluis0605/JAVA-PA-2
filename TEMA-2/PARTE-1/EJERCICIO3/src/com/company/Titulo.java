package com.company;

public class Titulo {

    private String nombre;
    private Asignatura asignaturas[];
    private int numeroAsignaturas;

    public Titulo(String nombre){
        this.nombre= nombre;
        asignaturas= new Asignatura[10];
        this.numeroAsignaturas=0;
    }

    public void addAsignatura(Asignatura asignatura){
        if (numeroAsignaturas < asignaturas.length){
            asignaturas[numeroAsignaturas]= asignatura;
            numeroAsignaturas++;
        }
    }

    public void mostrar(){
        for (int i=0;i<numeroAsignaturas;i++){
            System.out.println(asignaturas[i]);
            System.out.println("**********************************");
        }
    }

    public void mostrarDadaInformacion(String asignatura, int curso){
        for (int i=0;i<numeroAsignaturas;i++){
            if (asignaturas[i].coincide(asignatura, curso)){
                System.out.println(asignaturas[i]);
            }
        }
    }

    public int totalCreditos(){
        int numeroCreditos= 0;
        for (int i = 0; i < numeroAsignaturas; i++) {
            numeroCreditos= numeroAsignaturas+asignaturas[i].getNumeroCreditos();
        }
        return numeroCreditos;
    }

}
