package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Almacen almacen1 = new Almacen();

        double volumen = almacen1.calcularEspacioNecesario();

        System.out.println("Volumen Total: ");
        System.out.println(volumen);
    }
}
