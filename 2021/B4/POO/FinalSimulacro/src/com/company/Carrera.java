package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrera  extends OfertaAcademica{

    private List<OfertaAcademica> ofertas;
    private Double precioBase = 0.0;

    public Carrera() {
        this.ofertas = new ArrayList<>();
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public void agregar(OfertaAcademica oferta) throws Exception {
        if (oferta instanceof Curso){
            if(((Curso) oferta).getCargaHoraria() < 10) {
                throw new Exception("No se permite el ingreso de materias con menos de 10 horas");
            }
        }
        ofertas.add(oferta);
    }

    @Override
    public Double calcularPrecio() {
        double total = 0;

        for(OfertaAcademica oferta: ofertas)
            total += oferta.calcularPrecio();

        return total + precioBase;
    }

}
