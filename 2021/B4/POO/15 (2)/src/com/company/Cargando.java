package com.company;

public class Cargando implements CarritoState{

    private Carrito c;

    public Cargando(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto p) {
        c.getProductos().add(p);
    }

    @Override
    public void cancelarCarrito() {
        c.setEstado(new Vacio(c));
    }

    @Override
    public void volverEstadoAnterior() {
        c.setEstado(new Vacio(c));
    }

    @Override
    public void pasarEstado() {
        c.setEstado(new Pagando(c));
    }
}
