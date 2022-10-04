package com.company;

public class Asignatura {

    private String obligatoriedad;
    private int numeroCreditos;
    private String nombre;
    private int semestre;

    public Asignatura(String obligatoriedad, int numeroCreditos, String nombre, int semestre){
        this.obligatoriedad= obligatoriedad;
        this.numeroCreditos= numeroCreditos;
        this.nombre= nombre;
        this.semestre= semestre;
    }

    public String toString(){
        return nombre+" "+numeroCreditos+" creditos y semestre: "+semestre;
    }


    public boolean coincide(String asignatura, int curso) {
        return asignatura==nombre && curso==semestre;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }
}
