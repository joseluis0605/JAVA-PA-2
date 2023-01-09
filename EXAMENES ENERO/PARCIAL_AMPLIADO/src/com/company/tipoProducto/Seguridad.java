package com.company.tipoProducto;

import com.company.clasesProporcionadas.Fecha;
import com.company.clasesProporcionadas.ProductoSeguridad;

public class Seguridad extends ProductoSeguridad {

    private boolean cualificados;

    public Seguridad(double coste, Fecha inicioContrato, Fecha finContrato, boolean cualificados){
        super(coste, inicioContrato, finContrato);
        this.cualificados= cualificados;
    }
}
