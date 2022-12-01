package com.company.tipoProducto.tipoAntivirus;

import com.company.Fecha;
import com.company.tipoProducto.Antivirus;

public class Premium extends Antivirus {

    public Premium(double coste, Fecha inicioContrato, Fecha finContrato, int numeroDispositivos){
        super(coste, inicioContrato, finContrato, numeroDispositivos);
    }

    public String toString(){
        return super.toString()+" soy antivirus PREMIUM";
    }
}
