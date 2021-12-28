package com.company;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Producto> productos;
    private CarritoState estado;


    public Carrito(ArrayList<Producto> productos) {
        this.productos = productos;
        this.estado = new Vacio(this);
    }


    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public void setEstado(CarritoState estado) {
        this.estado = estado;
    }
    public CarritoState getEstado() {
        return estado;
    }


    void agregarProducto(Producto p){
        this.getEstado().agregarProducto(p);
    }
    void cancelarCarrito(){
        this.getEstado().cancelarCarrito();
    }
    void volverEstadoAnterior(){
        this.getEstado().volverEstadoAnterior();
    }
    void pasarEstado(){
        this.getEstado().pasarEstado();
    }

}
