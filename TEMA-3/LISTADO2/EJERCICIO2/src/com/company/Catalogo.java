package com.company;

public class Catalogo {

    private Producto catalogo[];
    private int numero;

    public Catalogo(int tam){
        this.numero=0;
        this.catalogo= new Producto[tam];
    }

    public void addProducto(Producto producto){
        if (numero<catalogo.length){
            catalogo[numero]= producto;
            numero++;
        }else {
            System.out.println("El catalogo esta completo y no entra mas");
        }
    }

    public void mostrarCatalogo(){
    System.out.println("****CATALOGO****");
        for (int i = 0; i < numero; i++) {
            System.out.println(catalogo[i]);
        }
    }

    public void mostrarLetraConsumo(String letra){
        System.out.println("CATALOGO CON CONSUMO: "+letra);
        for (int i = 0; i < numero; i++) {
            if (catalogo[i].esLetra(letra)){
                System.out.println(catalogo[i]);
            }
        }
    }

    public void mostrarProducto (String producto){
        for (int i = 0; i < numero; i++) {
            if (catalogo[i].esProducto(producto)){
                System.out.println(catalogo[i]);
            }
        }
    }

    public void mostrarPeso(int peso){
        for (int i = 0; i < numero; i++) {
            if (catalogo[i].esMenor(peso)){
                System.out.println(catalogo[i]);
            }
        }
    }


}
