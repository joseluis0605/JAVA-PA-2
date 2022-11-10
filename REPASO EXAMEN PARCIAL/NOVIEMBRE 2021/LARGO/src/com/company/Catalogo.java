package com.company;

public class Catalogo {

    private GenericaNoticia listado[];
    private int index;

    public Catalogo(){
        this.listado= new GenericaNoticia[10];
        this.index=0;
    }

    public void addNoticia(GenericaNoticia genericaNoticia){
        if (index<listado.length){
            listado[index]=genericaNoticia;
            index++;
        }
    }

    public void mostrarTodo(){
        for (int i = 0; i < index; i++) {
            System.out.println(listado[i]);
        }
    }

    public void mostrarFecha(Fecha fecha){
        for (int i = 0; i < index; i++) {
            if (listado[i].mismaFecha(fecha)){
                System.out.println(listado[i]);
            }
        }
    }

    public void keyWords() {
        for (int i = 0; i < index; i++) {
            listado[i].mostrarKey();
        }
    }
}
/*
Mostrar aquellas noticias publicadas en una determinada fecha.
- Mostrar aquellas noticias que hablen de un determinado tema.
- Mostrar las keywords de todas noticias publicadas. Es decir, mostrar las palabras más
relevantes del contenido de una noticia. Se considerarán keywords aquellas que
comiencen por una letra mayúscula, independientemente de en qué parte de la noticia
estén. Esto permite ver rápidamente qué está ocurriendo en los últimos tiempos en lo
relativo a ciberseguridad.
 */