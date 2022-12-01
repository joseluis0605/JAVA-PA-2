package com.company.tipoProducto;

import com.company.Fecha;
import com.company.ProductoSeguridad;

public abstract class PersonalSeguridad extends ProductoSeguridad {

    private boolean cualificados;

    public PersonalSeguridad(double coste, Fecha inicioContrato, Fecha finContrato, boolean cualificados){
        super(coste, inicioContrato, finContrato);
        this.cualificados= cualificados;
    }

    //lo hago protegido porque lo necesito usar en mis clases hijas
    protected boolean isCualificados() {
        return cualificados;
    }

    public String toString(){
        return super.toString()+" cualificados: "+cualificados;
    }
}
