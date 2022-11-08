package com.company;

public class ComunidadUniversitaria {

    private Persona personal[];
    private int indice;

    public ComunidadUniversitaria(){
        this.personal= new Persona[100];
        this.indice=0;
    }

    public void addPersona(Persona persona){
        if (indice< personal.length){
            personal[indice]=persona;
            indice++;
        }
    }

    public void mostrarComunidad(){
        for (int i = 0; i < indice; i++) {
            System.out.println(personal[i]);
        }
    }

    public void termina(int year) {
        for (int j = 0; j < indice; j++) {
            if (personal[j].terminayear(year)){
                System.out.println(personal[j]);
            }
        }
    }

    public void mostrarSeccion(Seccion seccion) {
        for (int i = 0; i < indice; i++) {
            if (personal[i].esSeccion(seccion)){
                System.out.println(personal[i]);
            }
        }
    }

    public void gradoMasSolicitado() {
        int ciber=0;
        int computadores=0;
        int informatica=0;
        int software=0;
        int max=0;
        String gradoMax=" ";
        for (int i = 0; i < indice; i++) {
            if (personal[i].esCiber()){
                ciber++;
                if (max<ciber){
                    max=ciber;
                    gradoMax="ciber";
                }
            }else if (personal[i].esInfor()){
                informatica++;
                if (max<informatica){
                    max=informatica;
                    gradoMax="informatica";
                }
            }else if (personal[i].esSoft()){
                software++;
                if (max<software){
                    max=software;
                    gradoMax="software";
                }
            }else if (personal[i].esComp()){
                computadores++;
                if (max<computadores){
                    max=computadores;
                    gradoMax="computadores";
                }
            }
        }
        System.out.println(ciber+" "+informatica+" "+computadores+" "+software);
        System.out.println(gradoMax+" "+max);
    }
}
