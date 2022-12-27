package com.company;

import com.company.excepciones.UsuarioRegistradoException;
import com.company.excepciones.VehiculoRegistradoException;

import java.util.*;

public class Gestor {

    private Set<Usuario> listadoUsuario;
    private Set<Vehiculo> listaVehiculo;
    private Map<Usuario, Map<String, Vehiculo>> mapaDni;

    public Gestor(){
        this.listadoUsuario= new HashSet<>();
        this.listaVehiculo= new HashSet<>();
        this.mapaDni= new HashMap<>();
    }

    public void registradUsuario(String dni)throws UsuarioRegistradoException{
        Usuario usuario= new Usuario(dni);
        if (!listadoUsuario.contains(usuario)){
            listadoUsuario.add(usuario);
            Map<String, Vehiculo> mapa= new HashMap<>();
            mapaDni.put(usuario, mapa);
        }else {
            throw new UsuarioRegistradoException();
        }
    }

    public void registrarVehiculo(Vehiculo vehiculo, String dni) throws UsuarioRegistradoException, VehiculoRegistradoException {
        Usuario usuario= new Usuario(dni);
        if (listadoUsuario.contains(usuario)){
            //existe usuario para registrar vehiculo
            listaVehiculo.add(vehiculo);
            Map<String,Vehiculo> mapaActual= mapaDni.get(usuario);
            //ya tengo el mapa de matriculas
            Vehiculo vehiculo1= mapaActual.get(vehiculo.getMatricula());
            if (vehiculo1==null){
                mapaActual.put(vehiculo.getMatricula(), vehiculo);
            }else {
                throw new VehiculoRegistradoException();
            }
            mapaDni.put(usuario, mapaActual);
        }else {
            throw new UsuarioRegistradoException();
        }
    }

    public void mostrarInfo(){
        for (Map.Entry<Usuario, Map<String, Vehiculo>> valor : mapaDni.entrySet()){
            System.out.println("con dni ----> "+valor.getKey());
            for (Map.Entry<String, Vehiculo> entrada :valor.getValue().entrySet()){
                System.out.println("con matricula---> "+entrada.getKey()+" "+entrada.getValue());
            }
        }
    }

    public void mostrarDni(String dni){
        Usuario usuario= new Usuario(dni);
        System.out.println(mapaDni.get(usuario));
    }

    public void mostrarImpuestoCoche(String dni, String matricula){
        Usuario usuario= new Usuario(dni);
        Map<String, Vehiculo> mapaAux= mapaDni.get(usuario);
        if (mapaAux!=null){
            System.out.println(mapaAux.get(matricula));
        }
    }


}
/*
[1.25 puntos] Implementar todo lo necesario para que un determinado usuario pueda dar de alta un
vehículo en el sistema. Solo podrá registrar un vehículo si previamente el ciudadano ya estaba dado
de alta en el sistema. En otro caso si lo intenta recibirá un mensaje informativo indicando que no
está dado de alta y terminará la ejecución. Y si trata de registrar un vehículo con una matrícula que
ya existe, entonces recibirá un mensaje informativo y terminará la ejecución. Es importante tener
en cuenta que el sistema deberá poder hacer búsquedas eficientes de los datos de un determinado
vehículo para un determinado ciudadano. Incluso para el propio momento de comprobar si ya está
el vehículo registrado o no.

 */