package com.company;

import java.util.Objects;

public class Vehiculo {

    private String matricula;
    private int potencia;
    private int precio;

    public Vehiculo(String matricula, int potencia){
        this.matricula= matricula;
        this.potencia= potencia;
        this.precio=0;
    }

    public String toString(){
        return "matricula--> "+matricula+" precio--> "+precio;
    }

    public boolean tieneMas140(){
        return this.potencia>140;
    }

    public void changeDinero(){
        if (tieneMas140()){
            setPrecio(getPrecio()+60);
        }else {
            setPrecio(getPrecio()+50);
        }
    }


    //UN COCHE VA A SER IGUAL POR SU MATRICULA YA QUE ES UNICA

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    //GETTER AND SETTER

    protected String getMatricula() {
        return matricula;
    }

    protected void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    protected int getPotencia() {
        return potencia;
    }

    protected void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    protected int getPrecio() {
        return precio;
    }

    protected void setPrecio(int precio) {
        this.precio = precio;
    }
}


/*
Hay que tener en cuenta que los vehículos pueden ser de varios tipos: eléctricos,
híbridos (eléctrico-combustión o gas-combustión) o de combustión (diésel o gasolina). El impuesto
de circulación que se aplica a cada uno de ellos varía. Para todo vehículo se parte de un precio base
de 50 euros si el vehículo tiene menos de 140 caballos y 60 euros en otro caso. Si el vehículo es
eléctrico, este impuesto se reduce a la mitad, si es híbrido se reduciría un 30% y si es de combustión,
sólo hay variación si es diésel incrementando el precio base del impuesto en 10 euros. Además, en
el caso de los vehículos eco se debe conocer cuál es su autonomía en kilómetros.
 */