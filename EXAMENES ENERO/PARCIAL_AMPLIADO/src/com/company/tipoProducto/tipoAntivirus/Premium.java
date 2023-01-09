package com.company.tipoProducto.tipoAntivirus;

import com.company.clasesProporcionadas.Fecha;
import com.company.tipoProducto.Antivirus;

public class Premium extends Antivirus {

    public Premium(double coste, Fecha inicioContrato, Fecha finContrato, int numeroDispositivos){
        super(coste, inicioContrato, finContrato, numeroDispositivos);
    }
}
