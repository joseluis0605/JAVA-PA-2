package com.company;

public class Serie {

    private String nombre;
    private int numeroTemporadas;
    private Temporada listadoT[];

    public Serie (String nombre, int max){
        this.nombre= nombre;
        this.listadoT= new Temporada[max];
        this.numeroTemporadas=0;
    }

    public void addTemporada(Temporada temporada){
        if (numeroTemporadas< listadoT.length){
            listadoT[numeroTemporadas]= temporada;
            numeroTemporadas++;
        }
    }

    public void mostrarSerie(){
        for (int i = 0; i < numeroTemporadas; i++) {
            System.out.println("TEMPORADA "+(i+1)+" "+nombre);
            listadoT[i].mostrarTemporada();
        }
    }

    public void temporadaMasNumerosa(){
        int max= 0;
        int numeroCapitulosMax=0;

        for (int i = 0; i < numeroTemporadas; i++) {
            if (listadoT[i].masCapitulos(numeroCapitulosMax)){
                numeroCapitulosMax= listadoT[i].getNumeroCapitulos();
                max= i+1;
            }
        }

        System.out.println("temporada mas larga: "+max+" con "+numeroCapitulosMax);
    }

    public void mostrarMediaTemporada(int temporada) {
        for (int i = 0; i < numeroTemporadas; i++) {
            if ((i+1)==temporada){
                int media= listadoT[i].media();
                System.out.println("la media de la temporada "+temporada+" es "+media);
            }
        }
    }
}
