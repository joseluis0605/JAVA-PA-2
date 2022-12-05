package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {

    private Map<String, ArrayList<Aeropuerto>> miMapa;

    public Ejercicio3(){
        this.miMapa= new HashMap<>();

    }

    public void addViaje(String origen, String destino){
        Aeropuerto aux= new Aeropuerto(origen, destino);

        //Creamos una lista
        ArrayList<Aeropuerto> listaAux= miMapa.get(origen);
        if (listaAux==null){
            listaAux= new ArrayList<>();
            listaAux.add(aux);
        }else {
            listaAux.add(aux);
        }
        miMapa.put(origen, listaAux);
    }

    public void mostrar(){
        for (Map.Entry<String, ArrayList<Aeropuerto>> valor : miMapa.entrySet()){
            System.out.println("CON CLAVE: "+valor.getKey());
            System.out.println(valor.getValue());
            System.out.println("**************************");
        }
    }

    public void mostarClave(String origen){
        for (Map.Entry<String, ArrayList<Aeropuerto>> valor: miMapa.entrySet()){
            if (valor.getKey().equals(origen)){
                System.out.println("con clave "+valor.getKey());
                System.out.println(valor.getValue());
            }
        }
    }
}

/*
Se tiene una colección de aeropuertos (objetos de la clase Aeropuerto),
y se desea poder obtener un aeropuerto dado su nombre
• Declarar la estructura de datos adecuada para asociar el nombre de cada
aeropuerto con el objeto aeropuerto correspondiente
• Introducir varios aeropuertos asociados a sus nombres: “El Prat”,
“Barajas”, “Castellón”
• Obtener el objeto aeropuerto dado su nombre: “Barajas”

 */