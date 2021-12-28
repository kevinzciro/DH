package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{

    private Double porcentajeBonifiacion;
    private List<OfertaAcademica> ofertasAcademicas;

    public ProgramaIntensivo() {
        this.ofertasAcademicas =  new ArrayList<>();
    }

    public double getPorcentajeBonifiacion() {
        return porcentajeBonifiacion;
    }

    public void setPorcentajeBonifiacion(double porcentajeBonifiacion) {
        this.porcentajeBonifiacion = porcentajeBonifiacion;
    }

    public void agregar(OfertaAcademica oferta){
        ofertasAcademicas.add(oferta);
    }

    @Override
    public Double calcularPrecio() {
        Double total = 0.0;
        for(OfertaAcademica oferta: ofertasAcademicas)
            total += oferta.calcularPrecio();

        return total - (total * porcentajeBonifiacion / 100);
    }


}
