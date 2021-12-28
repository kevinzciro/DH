package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Perro primerPerro = new Perro("Pepe", 7.0, true);
        primerPerro.sePuedeAdoptar();
        primerPerro.setAnioNacimiento(2000);
        primerPerro.edad();
        primerPerro.setTieneChip(false);
        primerPerro.sePuedePerder();
    }
}
