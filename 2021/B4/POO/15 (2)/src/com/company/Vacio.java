package com.company;

public class Vacio implements CarritoState{

    private Carrito c;

    public Vacio(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto p) {
        System.out.println("No se pueden agregar productos en el estado Vacio.");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("El carrito ya esta vacio.");
    }

    @Override
    public void volverEstadoAnterior() {
        System.out.println("No se puede volver a un estado anterior, el carrito esta Vacio.");
    }

    @Override
    public void pasarEstado() {
        c.setEstado(new Cargando(c));
    }
}
