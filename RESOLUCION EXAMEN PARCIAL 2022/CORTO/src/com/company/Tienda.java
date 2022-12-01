package com.company;

public class Tienda {
    private Bicicleta[] bicicletas;
    private int numBicicletas;

    public Tienda(int maxBicis) {
        this.bicicletas = new Bicicleta[maxBicis];
        this.numBicicletas = 0;
    }

    public void add(Bicicleta bicicleta) {
        if (this.numBicicletas < this.bicicletas.length) {
            this.bicicletas[this.numBicicletas++] = bicicleta;
        }
    }







    public static void main(String[] args) {
        Tienda t = new Tienda(100);
        t.add(new Bicicleta("BH","ModeloBH1",250));
        t.add(new Bicicleta("BH","ModeloBH2",275));
        t.add(new Bicicleta("Orbea","ModeloOrbea1",350));
        t.add(new Bicicleta("Orbea","ModeloOrbea2",450));
        t.add(new Bicicleta("Orbea","ModeloOrbea2",345));
        t.add(new Bicicleta("Orbea","ModeloOrbea2",3450));
        t.add(new Bicicleta("Trek","ModeloTrek1",550));
        t.add(new Bicicleta("Trek","ModeloTrek2",750));
        t.add(new Bicicleta("Cube","ModeloCube1",400));

        Bicicleta [] bicis = t.getBicicletas("Trek");
        for (Bicicleta b : bicis) {
            System.out.println(b);
        }

        t.showEquals(new Bicicleta("Orbea","ModeloOrbea2"));

    }

    public void showEquals(Bicicleta bicicleta) {
        for (int i = 0; i < numBicicletas; i++) {
            if (bicicletas[i].esMisma(bicicleta)){
                System.out.println("******************");
                System.out.println(bicicletas[i]);
            }
        }
    }


    public Bicicleta[] getBicicletas(String trek) {
        Bicicleta bicicletaMarca[]= new Bicicleta[this.numBicicletas];
        int numeroBici=0;

        for (int i = 0; i < numBicicletas; i++) {
            if (bicicletas[i].coincideMarca(trek)){
                bicicletaMarca[numeroBici]= bicicletas[i];
                numeroBici++;
            }
        }
        return bicicletaMarca;
    }


}
