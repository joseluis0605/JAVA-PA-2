package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Gestor gestor= new Gestor();

        gestor.addPersona("jose luis", "españa", "m", 1);
        gestor.addPersona("luis", "francia", "m", 2);
        gestor.addPersona("juan", "españa", "m", 3);
        gestor.addPersona("teresa", "italia", "f", 4);
        gestor.addPersona("carlota", "españa", "f", 5);
        gestor.addPersona("josefina", "francia", "f", 6);
        gestor.addPersona("jose ", "españa", "m", 7);
        gestor.addPersona("maria", "alemania", "f",8 );

        gestor.mostrarOrdenadaNacionalidad("españa");
    }
}
/*
Crea una clase colegio que almacene la nacionalidad de los alumnos de un colegio. La clase tendrá los siguientes métodos.

addAlumno(String nacionalidad)
añade la nacionalidad de un nuevo alumno

showAll()
Muestra las distintas nacionalidades y el número de alumnos que existen por nacionalidad.

pista:
for(String key: nacionalidades.keySet())
System.out.println(key + » – » + nacionalidades.get(key));

showNacionalidad(String nacionalidad)
Muestra la nacionalidad y el número de alumnos de esa nacionalidad

cuantos()
Muestra cuántas nacionalidades diferentes existen en el colegio.

borra()
Elimina los datos insertados.

Crea también una clase para testear la clase anterior.
Crea también una clase exceptionVacio del tipo Exception que será lanzada en el caso que se llame al método addAlumno(String nacionalidad) con un parámetro nacionalidad vacío.
Nota: Las nacionalidades se almacenan en mayúsculas.
 */