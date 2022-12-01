package com.company;

public class Extendida extends Corta{

    private Parrafo listado[];
    private int numero;

    public Extendida(Fecha fecha, String resumen, String titular){
        super(fecha, resumen, titular);
        this.listado= new Parrafo[10];
        this.numero=0;
    }

    public void addParrafo(Parrafo parrafo){
        if (numero< listado.length){
            this.listado[numero]=parrafo;
            numero++;
        }
    }

    @Override
    public boolean mismoTema(String tema) {
        boolean esta=false;
        for (int i = 0; i < numero; i++) {
            if (listado[i].tieneTema(tema)){
                esta= true;
            }
        }
        return super.mismoTema(tema) ||  esta;
    }

    @Override
    public boolean esCorta() {
        return false;
    }
}
