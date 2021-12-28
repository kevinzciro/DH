package com.company;

public class Cliente {

    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

//    getters
    public Integer getNumeroCliente(){
        return this.numeroCliente;
    }
    public String getNombre(){
        return this.nombre;
    }
    public Double getDeuda(){
        return this.deuda;
    }

//    Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }

//    Constructora
    public Cliente(Integer numeroCliente, String nombre){
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.deuda = 0.0;
        this.deuda = 0.0;
    }
}
