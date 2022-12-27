package com.company.tipoECO;

import com.company.tipoECO.ECO;

public class Electrico extends ECO {

    public Electrico(String matricula, int potencia, int km){
        super(matricula, potencia, km);
        changeDinero();
    }

    public String toString(){
        return "ELECTRICO: "+super.toString();
    }

    @Override
    public void changeDinero() {
        super.changeDinero();
        int precio= getPrecio();
        precio= precio/2;
        setPrecio(precio);
    }
}
/*
Si el vehículo es
eléctrico, este impuesto se reduce a la mitad, si es híbrido se reduciría un 30% y si es de combustión,
sólo hay variación si es diésel incrementando el precio base del impuesto en 10 euros. Además, en
el caso de los vehículos eco se debe conocer cuál es su autonomía en kilómetros.
 */