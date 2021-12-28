package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cliente cliente1 = new Cliente(1,"Zapata",123456,123441);

        Cuenta cuenta = new CuentaAhorro(cliente1, 1000.0,1, 1.0);

        System.out.println("saldo inicial: " + cuenta.getSaldo());
        cuenta.extraer(500.0);
        System.out.println("despues de extraccion: " + cuenta.getSaldo());
        cuenta.depositar(100.0);
        System.out.println("despues deposito: " + cuenta.getSaldo());
        ((CuentaAhorro)cuenta).cobrarInteres();
        System.out.println("despues cobrar interes: " + cuenta.getSaldo());

        cuenta = new CuentaCorriente(cliente1, 606.0, 1,300.0);
        cuenta.extraer(750.0);
        System.out.println("despues de extraccion: "+ cuenta.getSaldo());
        System.out.println("monto Girar: "+ ((CuentaCorriente)cuenta).getMontoGirar());
    }
}
