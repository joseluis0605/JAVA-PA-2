package com.company;

import com.company.clasesProporcionadas.Cliente;
import com.company.clasesProporcionadas.Contrato;
import com.company.clasesProporcionadas.Fecha;
import com.company.clasesProporcionadas.ProductoSeguridad;
import jdk.incubator.foreign.CLinker;

import java.util.*;

public class Gestor {

    private ArrayList<Contrato> listaContratos;
    private Map<String, ArrayList<Contrato>> mapaCliente;

    public Gestor(){
        this.listaContratos= new ArrayList<>();
        this.mapaCliente= new HashMap<>();
    }

    public void addProductoSeguridadCliente(ProductoSeguridad productoSeguridad, Cliente cliente, Fecha fecha){
        ArrayList<Contrato> lista= mapaCliente.get(cliente.getDni());
        Contrato contrato= new Contrato(fecha, cliente, productoSeguridad);
        if (lista==null){
            lista= new ArrayList<>();
            lista.add(contrato);
            this.mapaCliente.put(cliente.getDni(), lista);
            this.listaContratos.add(contrato);
        }else {
            if (!listaContratos.contains(contrato)){
                lista.add(contrato);
                listaContratos.add(contrato);
                mapaCliente.put(cliente.getDni(),lista);
            }
        }
    }

    public void mostrarDadoDNI(String dni){

        ArrayList<Contrato> listaAux= mapaCliente.get(dni);
        Collections.sort(listaAux, new ComparadorCliente());
        System.out.println(listaAux);

    }

    public void mostrarDespuesDe(Fecha fecha){
        for (Map.Entry<String, ArrayList<Contrato>> dni : mapaCliente.entrySet()){
            ArrayList<Contrato> listaAux= dni.getValue();
            for (Contrato contrato : listaAux){
                if (contrato.eresDespuesDe(fecha)){
                    System.out.println(contrato);
                }
            }
        }
    }
}
