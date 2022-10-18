package com.company;

public class Producto {

    private String nombre;
    private int precio;
    private int peso;
    private String consumo;

    public Producto(String nombre, int precio, int peso, String consumo){
        this.nombre= nombre;
        this.precio= precio;
        this.peso= peso;
        this.consumo= consumo;
        modificar(consumo);
    }

    public String toString(){
        return "nombre: "+nombre+" "+precio+"€ "+peso+"kg "+consumo;
    }

    private void modificar(String letra){
        switch (letra){
            case "A":
                setPrecio(getPrecio()+100);
            break;

            case "B":
                setPrecio(getPrecio()+80);
            break;

            case "C":
                setPrecio(getPrecio()+60);
            break;

            case "D":
                setPrecio(getPrecio()+50);
            break;

            case "E":
                setPrecio(getPrecio()+30);
            break;

            case "F":
                setPrecio(getPrecio()+10);
            break;

            default:
                System.out.println("NO COINCIDE LETRA");

        }
    }

    private void setPrecio(int precio) {
        this.precio = precio;
    }

    private int getPrecio() {
        return precio;
    }

    public boolean esLetra(String letra) {
        return this.consumo.equals(letra);
    }

    public boolean esProducto(String producto) {
        return this.nombre.equals(producto);
    }

    public boolean esMenor(int peso) {
        return this.peso<=peso;
    }
}
