package com.company.instrumento.cuerda;

import com.company.Instrumento;
import com.company.TipoInstrumento;

public class Cuerda extends Instrumento {

    private int antiguedad;

    public Cuerda(TipoInstrumento tipoInstrumento, String marca, int precio, int antiguedad){
        super(tipoInstrumento, marca, precio);
        this.antiguedad= antiguedad;
        cambioPrecio();
    }

    private void cambioPrecio() {
        int precio= getPrecio();
        if (this.antiguedad>10 && this.antiguedad<20){
            precio= precio*110;
        }else  if (this.antiguedad>=20){
            precio=precio*120;
        }else {
            precio= precio*105;
        }
        setPrecio(precio/100);
    }

    public String toString(){
        return super.toString()+" antiguedad: "+this.antiguedad;
    }


}
