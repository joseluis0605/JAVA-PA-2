package com.company.tipoProducto;

import com.company.clasesProporcionadas.Fecha;
import com.company.clasesProporcionadas.ProductoSeguridad;

public class Antivirus extends ProductoSeguridad {

    private int numeroDispositivos;

    public Antivirus(double coste, Fecha inicioContrato, Fecha finContrato, int numeroDispositivos){
        super(coste, inicioContrato, finContrato);
        this.numeroDispositivos= numeroDispositivos;
    }

}
