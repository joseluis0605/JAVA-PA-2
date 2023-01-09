package com.company.tipoProducto.tipoAntivirus;

import com.company.clasesProporcionadas.Fecha;
import com.company.tipoProducto.Antivirus;

public class Basic extends Antivirus {

    public Basic(double coste, Fecha inicioContrato, Fecha finContrato){
        super(coste, inicioContrato, finContrato, 1);
    }
}
