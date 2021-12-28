package com.company;

public interface CarritoState {

    void agregarProducto(Producto p);
    void cancelarCarrito();
    void volverEstadoAnterior();
    void pasarEstado();
}
