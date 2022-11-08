package com.company.instrumento.cuerda.instrumentosCuerda;

import com.company.TipoInstrumento;
import com.company.instrumento.cuerda.Cuerda;

import javax.swing.*;

public class Piano extends Cuerda {

    public Piano(TipoInstrumento tipoInstrumento, String marca, int precio, int antiguedad){
        super(tipoInstrumento, marca, precio, antiguedad);

    }
}
