package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente = new Cliente("Jose", "Heredia");
        System.out.println(cliente.getNombre());

        Cuenta cuenta = new Cuenta(1,1000.0);
        cuenta.deposito(100.0);
        System.out.println(cuenta.getSaldo());
    }
}
