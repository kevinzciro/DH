package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Reparacion reparacion1 = new Reparacion("Batidora");

        reparacion1.valorReparacion(100.0);

        reparacion1.pasarDeEstado();
        reparacion1.agregarRepuesto(50.0);
//        System.out.println(reparacion1.toString());
        reparacion1.agregarRepuesto(25.0);
//        System.out.println(reparacion1.toString());
        reparacion1.pasarDeEstado();
        reparacion1.CambiarDireccion("Calle 12");
//        System.out.println(reparacion1.toString());
        reparacion1.pasarDeEstado();
//        System.out.println(reparacion1.toString());
        reparacion1.pasarDeEstado();

    }
}
