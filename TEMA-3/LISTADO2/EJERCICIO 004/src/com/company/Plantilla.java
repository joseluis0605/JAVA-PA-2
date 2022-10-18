package com.company;

public class Plantilla {

    private Persona listado[];
    private int numeroPersonas;

    public Plantilla(int max){
        this.numeroPersonas=0;
        this.listado= new Persona[max];
    }

    public void addPersona(Persona persona){
        if (numeroPersonas< listado.length){
            listado[numeroPersonas]= persona;
            numeroPersonas++;
        }
    }

    public void mostrarPlantilla(){
        for (int i = 0; i < numeroPersonas; i++) {
            System.out.println(listado[i]);
        }
    }

    public void addHoraExtra(Dni dni){
        for (int i = 0; i < numeroPersonas; i++) {
            if (listado[i].coincideDni(dni)){
                listado[i].addHoraExtra();
            }
        }
    }

    public void mostrarDni (Dni dni){
        for (int i = 0; i < numeroPersonas; i++) {
            if (listado[i].coincideDni(dni)){
                System.out.println(listado[i]);
            }
        }
    }

    public void ordenarSueldo(){
        Persona aux;
        for (int j = 0; j < numeroPersonas; j++) {
            for (int i = 0; i < numeroPersonas-1; i++) {
                if (listado[i].ganaMas(listado[i+1])){
                    aux= listado[i];
                    listado[i]= listado[i+1];
                    listado[i+1]= aux;
                }
            }
        }
    }

    public void mostrarGananMasX (int sueldo){
        for (int i = 0; i < numeroPersonas; i++) {
            if (listado[i].ganaMasDinero(sueldo)){
                System.out.println(listado[i]);
            }
        }
    }

    public void mediaHorasExtras (){
        int tam=0;
        for (int i = 0; i < numeroPersonas; i++) {
            if (listado[i].horaExtra()){
                tam++;
            }
        }

        System.out.println(tam+"/"+numeroPersonas);
    }

    public void mediaEdadPlantilla(){
        int sumador= 0;
        for (int i = 0; i < numeroPersonas; i++) {
            sumador= sumador + listado[i].getEdad();
        }

        System.out.println((sumador/numeroPersonas));
    }

    public void rangoEdad(){
        int media1= 0, media2= 0, media3= 0, media4= 0;

        for (int i = 0; i < numeroPersonas; i++) {
            if (listado[i].esMedia1()){
                media1++;
            }
            if (listado[i].esMedia2()){
                media2++;
            }
            if (listado[i].esMedia3()){
                media3++;
            }
            if (listado[i].esMedia4()){
                media4++;
            }
        }
        System.out.println(media1+" "+media2+" "+media3+" "+media4);
    }
}
