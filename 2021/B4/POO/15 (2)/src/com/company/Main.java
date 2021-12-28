package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Producto producto1 = new Producto("producto1","descripcion producto1", 10);
        Producto producto2 = new Producto("producto2","descripcion producto2", 5);
        Producto producto3 = new Producto("producto3","descripcion producto3", 65);
        Producto producto4 = new Producto("producto4","descripcion producto4", 4);
        Producto producto5 = new Producto("producto5","descripcion producto5", 54);

        ArrayList<Producto> productos = new ArrayList<>();

        Carrito carrito1 = new Carrito(productos);
        carrito1.pasarEstado();
        carrito1.agregarProducto(producto1);
        carrito1.agregarProducto(producto3);
        System.out.println(carrito1.getProductos().toString());

    }
}
