package com.company.tipoProducto.tipoAntivirus;

import com.company.Fecha;
import com.company.tipoProducto.Antivirus;

public class Basico extends Antivirus {

    public Basico(double coste, Fecha inicioContrato, Fecha finContrato){
        super(coste, inicioContrato, finContrato, 1);
    }


    public String toString(){
        return super.toString()+" soy antivirus BASICO";
    }
}
