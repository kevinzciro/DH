package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Construccion construccion = new Construccion("Calle 19", "10 Enero 2020", "10 Octubre 2021", "10 Noviembre 2021");

        Proyecto proyecto1 = new Casa(1,"proyecto1","Bogota", "cancelado", construccion, 115.2,3,5);

        System.out.println(proyecto1.finalizoFecha());

        proyecto1 = new Departamento(1,"proyecto1","Bogota", "finalizado", construccion, 20,4);
        Proyecto proyecto2 = new Departamento(1,"proyecto1","Bogota", "finalizado", construccion, 10,2);

        System.out.println(((Departamento)proyecto1).compareTo(proyecto2));

        System.out.println(((Departamento)proyecto1).rascacielos());

    }
}
