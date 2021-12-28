package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Instituto {
    private String nombre;
    private List<OfertaAcademica> ofertas;

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.ofertas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(OfertaAcademica o){
        ofertas.add(o);
    }

    public void generarInforme(){
        for(OfertaAcademica oferta :ofertas)
            System.out.println(oferta.getNombre() + " precio:" + oferta.calcularPrecio());
    }

}
