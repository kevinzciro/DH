package com.company;

public class Curso extends OfertaAcademica{

    private Double cargaHoraria;
    private Double duracion;
    private Double valorHora;

    public Curso(){
        this.cargaHoraria = 0.0;
        this.duracion = 0.0;
        this.valorHora= 0.0;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public Double calcularPrecio() {
        return cargaHoraria * duracion * valorHora;
    }
}
