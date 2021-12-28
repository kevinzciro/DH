package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Carrito miCarrito = new Carrito();

        //Productos
        Producto item1 = new Producto("hamburguesa", 4.5);
        Producto item2 = new Producto("papas fritas", 2.5);
        Producto item3 = new Producto("helado", 1.5);
        Producto item4 = new Producto("cafe", 3.5);
        Producto item5 = new Producto("gaseosa", 2.5);
        Producto item6 = new Producto("media luna", 1.5);


       //Combos
        Combo combo1 = new Combo(3.0);
        combo1.addCombo(item1);
        combo1.addCombo(item2);
        combo1.addCombo(item5);

        Combo combo2 = new Combo(2.0);
        combo2.addCombo(item4);
        combo2.addCombo(item6);


       // Agregar al Carrito los Combos y/o Productos
        miCarrito.addCarrito(item1);
        miCarrito.addCarrito(item3);
        miCarrito.addCarrito(combo1);
        miCarrito.addCarrito(combo1);
        miCarrito.addCarrito(combo2);

        // Calcular el costo del carrito
        System.out.println("Costo total del carrito:" + miCarrito.calcularCosto());



    }
}
