package com.company;

public abstract class Contenido {

    private String nombre;
    private String descripcion;
    private double pesoContenido;

    public Contenido() {
        this.pesoContenido = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPesoContenido() {
        return pesoContenido;
    }

    public void setPesoContenido(double pesoContenido) {
        this.pesoContenido = pesoContenido;
    }

    public abstract double calcularPeso();


}
