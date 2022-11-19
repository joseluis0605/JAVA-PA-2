package com.company.tipoInstrumento;

import com.company.Instrumento;
import com.company.Tipo;

public abstract class Cuerda extends Instrumento {

    private int antiguedad;

    public Cuerda(String marca, Tipo tipoInstrumento, int precioBase, int antiguedad){
        super(marca, tipoInstrumento, precioBase);
        this.antiguedad= antiguedad;
        cambioCuerda();
    }

    private void cambioCuerda() {
        int precio= getPrecioBase();
        if (antiguedad>10 && antiguedad<20){
            precio= precio*110/100;
        }else  if (antiguedad>20){
            precio= precio*120/100;
        }else {
            precio= precio*105/100;
        }
        setPrecioBase(precio);
    }


}
