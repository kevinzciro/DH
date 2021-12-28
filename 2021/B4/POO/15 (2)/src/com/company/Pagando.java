package com.company;

public class Pagando implements CarritoState{

    private Carrito c;

    public Pagando(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto p) {
        System.out.println("No se pueden agregar productos en este Estado.");
    }

    @Override
    public void cancelarCarrito() {
        c.setEstado(new Vacio(c));
    }

    @Override
    public void volverEstadoAnterior() {
        c.setEstado(new Cargando(c));
    }

    @Override
    public void pasarEstado() {
        c.setEstado(new Cerrado(c));
    }
}
