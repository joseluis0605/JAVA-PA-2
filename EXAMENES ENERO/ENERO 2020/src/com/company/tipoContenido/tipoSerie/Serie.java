package com.company.tipoContenido.tipoSerie;

import com.company.Excepciones.NoSuchSeasonException;
import com.company.tipoContenido.Contenido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Serie extends Contenido {

    private Map<Integer, Temporada> mapaNumeroTemporada;

    public Serie(String titulo){
        super(titulo,0);
        this.mapaNumeroTemporada= new HashMap<>();
    }

    public String toString(){
        String cadena="";
        for (Map.Entry<Integer, Temporada> valor : mapaNumeroTemporada.entrySet()){
            cadena= cadena+valor.getValue()+"\n";
        }
        return "SERIE "+super.toString()+"\n"+cadena;
    }

    public void calculoSerieDuracion(){
        int contador=0;
        for (Map.Entry<Integer, Temporada> valor: mapaNumeroTemporada.entrySet()){
            contador= contador + valor.getValue().duracionTemporada();
        }
        setDuracion(contador);
    }

    public void addTemporada(int indice){
        Temporada temporada= new Temporada(indice);
        mapaNumeroTemporada.put(indice, temporada);

        calculoSerieDuracion();
    }

    public void addCapituloTemporada(int numero, Capitulo capitulo) throws NoSuchSeasonException{
        Temporada temporada= mapaNumeroTemporada.get(numero);
        if (temporada==null){
            throw new NoSuchSeasonException();
        }else {
            temporada.addCapitulo(capitulo);
            mapaNumeroTemporada.put(numero, temporada);

        }
        calculoSerieDuracion();
    }
}
