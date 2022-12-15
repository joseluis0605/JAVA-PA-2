package com.company.hackers;

import com.company.Dificultad;
import com.company.Exceptions.NoHackerAvailableException;
import com.company.amenaza.Amenaza;

public class Newbie extends Hacker {
    public Newbie(String idPersonalEmpresa) {
        super(idPersonalEmpresa, 4);
    }

    @Override
    public void addAmenaza(Amenaza amenaza) throws NoHackerAvailableException{
        if (amenaza.getDificultad().equals(Dificultad.BAJA) && getAmenazasAtendidas()<getMaximoAmenazas()){
            super.addAmenaza(amenaza);
        }else {
            throw  new NoHackerAvailableException();
        }
    }

    @Override
    public boolean puede(Amenaza amenaza) {
        return amenaza.getDificultad().equals(Dificultad.BAJA) && getAmenazasAtendidas()<getMaximoAmenazas();
    }

    @Override
    public String toString() {
        return "NEWBIE\n"+super.toString();
    }
}
