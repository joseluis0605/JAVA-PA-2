package com.company;

public class Tienda {

    private Instrumento catalogo[];
    private int numeroInstrumentos;

    public Tienda(){
        this.catalogo= new Instrumento[10];
        this.numeroInstrumentos=0;
    }

    public void addInstrumento(Instrumento instrumento){
        if (numeroInstrumentos< catalogo.length){
            catalogo[numeroInstrumentos]= instrumento;
            numeroInstrumentos++;
        }
    }

    public void mostrar(){
        for (int i = 0; i < numeroInstrumentos; i++) {
            System.out.println(catalogo[i]);
        }
    }

    public void mostrarRebajado() {
        for (int i = 0; i < numeroInstrumentos; i++) {
            if (catalogo[i].estaRebajado()){
                System.out.println(catalogo[i]);
            }
        }
    }

    public void mostrarInstrumento(TipoInstrumento tipoInstrumento) {

        for (int i = 0; i < numeroInstrumentos; i++) {
            if (catalogo[i].esInstrumento(tipoInstrumento)){
                System.out.println(catalogo[i]);
            }
        }
    }
}
