package com.company;

import com.company.tipoInstrumento.tipoCuerda.Guitarra;
import com.company.tipoInstrumento.tipoCuerda.Piano;
import com.company.tipoInstrumento.tipoPercusion.Timbales;
import com.company.tipoInstrumento.tipoPercusion.tipoBateria.Acustica;
import com.company.tipoInstrumento.tipoPercusion.tipoBateria.Electrica;
import com.company.tipoInstrumento.tipoViento.Oboe;

public class Main {

    public static void main(String[] args) {

        Piano piano1= new Piano("MARACATAN", Tipo.CUERDA, 100, 15);
        Piano piano2= new Piano("NISU", Tipo.CUERDA, 100, 25);
        Guitarra guitarra1= new Guitarra("SUMADRE",Tipo.CUERDA, 100, 5 );

        Timbales timbales1= new Timbales("MARCA1", Tipo.PERCUSION, 100, "COBRE");
        Timbales timbales2= new Timbales("MARCA1", Tipo.PERCUSION, 100, "PAJA");

        Acustica acustica1= new Acustica("ACUSTICA1", Tipo.PERCUSION, 100, 7, 10);
        Electrica electrica1= new Electrica("NO SE", Tipo.PERCUSION, 100);

        Oboe oboe1= new Oboe("NPI", Tipo.VIENTO, 100);


        Almacen almacen= new Almacen();

        almacen.addInstrumento(piano1);
        almacen.addInstrumento(piano2);
        almacen.addInstrumento(guitarra1);
        almacen.addInstrumento(timbales1);
        almacen.addInstrumento(timbales2);
        almacen.addInstrumento(acustica1);
        almacen.addInstrumento(electrica1);
        almacen.addInstrumento(oboe1);

        //almacen.mostrarTodo();

        //Guitarra guitarra2= new Guitarra("SUMADRE", Tipo.VIENTO, 100, 10);
        //almacen.mostrarDadaInformacion(guitarra2);

        almacen.aplicarDescuento(50, guitarra1);
        almacen.aplicarDescuento(50, oboe1);
        //almacen.mostrarTodo();

        //almacen.mostrarViento();

        almacen.mostrarRebajado();
    }
}
