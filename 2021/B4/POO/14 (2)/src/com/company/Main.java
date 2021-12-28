package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here''

        Puerto puerto1 = new Puerto("puerto1");

        Contenedor contenedor1 =  new Contenedor(1,"America", false);
        Contenedor contenedor2 =  new Contenedor(2,"Asia", false);
        Contenedor contenedor3 =  new Contenedor(3,"Africa", true);
        Contenedor contenedor4 =  new Contenedor(4,"Europa", false);
        Contenedor contenedor5 =  new Contenedor(5,"Desconocida", true);
        Contenedor contenedor6 =  new Contenedor(6,"America", false);

        puerto1.addContenedor(contenedor1);
        puerto1.addContenedor(contenedor2);
        puerto1.addContenedor(contenedor3);
        puerto1.addContenedor(contenedor4);
        puerto1.addContenedor(contenedor5);
        puerto1.addContenedor(contenedor6);

        puerto1.mostrarContenedores();
        System.out.println(puerto1.getCantidadContenedoresPeligrosos());

    }
}
