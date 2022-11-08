package com.company;

import com.company.instrumento.cuerda.instrumentosCuerda.Guitarra;
import com.company.instrumento.cuerda.instrumentosCuerda.Piano;
import com.company.instrumento.percusion.instrumentoPercusion.Timbal;
import com.company.instrumento.percusion.instrumentoPercusion.bateria.Acustica;
import com.company.instrumento.percusion.instrumentoPercusion.bateria.Electrica;
import com.company.instrumento.viento.instrumentosViento.Oboe;

public class Main {

    public static void main(String[] args) {
        Guitarra guitarra1= new Guitarra(TipoInstrumento.CUERDA,"GUITARRA",100,  16  );

        Piano piano1= new Piano(TipoInstrumento.CUERDA, "PIANO",  100, 50);

        Electrica electrica1 = new Electrica(TipoInstrumento.PERCUSION, "ELECTRICA", 100);

        Acustica acustica1= new Acustica(TipoInstrumento.PERCUSION, "ACUSTICA",100, 8, 6);

        Timbal timbales1= new Timbal(TipoInstrumento.PERCUSION, "TIMBALES",  100, "laton");

        Oboe oboe1 = new Oboe(TipoInstrumento.VIENTO, "OBOE",  100);

        Tienda tienda= new Tienda();

        tienda.addInstrumento(guitarra1);
        tienda.addInstrumento(piano1);
        tienda.addInstrumento(electrica1);
        tienda.addInstrumento(acustica1);
        tienda.addInstrumento(timbales1);
        tienda.addInstrumento(oboe1);

        tienda.mostrarInstrumento(TipoInstrumento.VIENTO);

    }
}
/*
Tienda tienda= new Tienda(100);

        Guitarra guitarra1= new Guitarra("CUERDA","GUITARRA","GUITARRA1", 100, 16  );
        Guitarra guitarra2= new Guitarra("CUERDA","GUITARRA","GUITARRA2", 200, 15  );
        Guitarra guitarra3= new Guitarra("CUERDA","GUITARRA","GUITARRA3", 300, 10  );
        Guitarra guitarra4= new Guitarra("CUERDA","GUITARRA","GUITARRA4", 100, 9 );

        Piano piano1= new Piano("CUERDA", "PIANO", "PIANO1", 100, 50);

        Electrica electrica1 = new Electrica("BATERIA ELECTRICA", "ELECTRICA","ELECTRICA1", 100);

        Acustica acustica1= new Acustica("BATERIA ACUSTICA", "ACUSTICA","ACUSTICA1", 100, 8,6);

        Timbales timbales1= new Timbales("PERCUSION", "TIMBALES", "TIMBALES1", 100, "laton");

        Oboe oboe1 = new Oboe("VIENTO", "OBOE", "OBOE1", 100);

        tienda.addGuitarra(guitarra1);
        tienda.addGuitarra(guitarra2);
        tienda.addGuitarra(guitarra3);
        tienda.addGuitarra(guitarra4);
        tienda.addPiano(piano1);
        tienda.addElectrica(electrica1);
        tienda.addAcustica(acustica1);
        tienda.addTimbales(timbales1);
        tienda.addOboe(oboe1);

        tienda.mostrarCatalogo();

                tienda.rebajada(guitarra1, 15);

                tienda.mostrarCatalogo();

 */