package com.company;

public class Cerrado implements CarritoState{

    private Carrito c;

    public Cerrado(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto p) {
        System.out.println("El carrito ya se encuentra cerrado");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("El carrito ya se encuentra cerrado");
    }

    @Override
    public void volverEstadoAnterior() {
        System.out.println("El carrito ya se encuentra cerrado");
    }

    @Override
    public void pasarEstado() {
        c.setEstado(new Vacio(c));
    }
}
