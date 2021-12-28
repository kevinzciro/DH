package com.company;

public class Taller extends OfertaAcademica{

    private Integer cantidad;
    private Double valor;

    public Taller() {
        super();
        this.cantidad = 0;
        this.valor = 0.0;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public Double calcularPrecio() {
        return cantidad * valor;
    }
}
