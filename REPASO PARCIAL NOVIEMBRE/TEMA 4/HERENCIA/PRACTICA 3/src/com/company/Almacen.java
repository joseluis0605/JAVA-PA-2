package com.company;

public class Almacen {

    private  Instrumento listado[];
    private int numeroInstrumentosAlmacen;

    public Almacen (){
        this.listado= new Instrumento[10];
        this.numeroInstrumentosAlmacen=0;
    }

    public void addInstrumento(Instrumento instrumento){
        if (numeroInstrumentosAlmacen<listado.length){
            listado[numeroInstrumentosAlmacen]= instrumento;
            numeroInstrumentosAlmacen++;
        }
    }

    public void mostrarTodo(){
        System.out.println("ALMACEN DE MUSICA");
        for (int i = 0; i < numeroInstrumentosAlmacen; i++) {
            System.out.println(listado[i]);
        }
    }

    public void mostrarDadaInformacion(Instrumento instrumento){
        System.out.println("buscamos el instrumento: "+instrumento);
        for (int i = 0; i < numeroInstrumentosAlmacen; i++) {
            if (listado[i].eresEste(instrumento)){
                System.out.println("encontrado en la posicion "+i +" el instrumento: "+listado[i]);
            }
        }
    }

    public void aplicarDescuento (int tanto, Instrumento ins){
        for (int i = 0; i < numeroInstrumentosAlmacen; i++) {
            if (listado[i].eresEste(ins)){
                listado[i].aplicarDescuento(tanto);
            }
        }
    }

    public void mostrarViento(){
        for (int i = 0; i < numeroInstrumentosAlmacen; i++) {
            if (listado[i].esViento()){
                System.out.println(listado[i]);
            }
        }
    }

    public void mostrarRebajado() {
        for (int i = 0; i < numeroInstrumentosAlmacen; i++) {
            if (listado[i].estasRebajado()){
                System.out.println(listado[i]);
            }
        }
    }
}
