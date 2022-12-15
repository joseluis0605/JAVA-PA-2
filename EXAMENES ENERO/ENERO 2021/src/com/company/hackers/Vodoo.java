package com.company.hackers;

import com.company.Dificultad;
import com.company.Exceptions.NoHackerAvailableException;
import com.company.amenaza.Amenaza;

public class Vodoo extends Hacker {
    public Vodoo(String idPersonalEmpresa) {
        super(idPersonalEmpresa, 4);
    }


    @Override
    public void addAmenaza(Amenaza amenaza) throws NoHackerAvailableException {
        if (!amenaza.getDificultad().equals(Dificultad.ALTA) && getAmenazasAtendidas()<getMaximoAmenazas()){
            super.addAmenaza(amenaza);
        }else {
            throw new NoHackerAvailableException();
        }
    }

    @Override
    public boolean puede(Amenaza amenaza) {
        return !amenaza.getDificultad().equals(Dificultad.ALTA) && getAmenazasAtendidas()<getMaximoAmenazas();
    }

    public String toString() {
        return "VODOO\n"+super.toString();
    }
}




