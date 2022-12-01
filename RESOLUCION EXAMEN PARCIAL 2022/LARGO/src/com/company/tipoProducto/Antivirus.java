package com.company.tipoProducto;

import com.company.Fecha;
import com.company.ProductoSeguridad;

public abstract class Antivirus extends ProductoSeguridad {

    private int numeroDispositivos;

    public Antivirus(double coste, Fecha inicioContrato, Fecha finContrato, int numeroDispositivos){
        super(coste, inicioContrato, finContrato);
        this.numeroDispositivos= numeroDispositivos;
    }

    public String toString(){
        return super.toString()+" numero dispositivos "+numeroDispositivos;
    }

}
