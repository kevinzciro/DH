package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Iphone device = FactoryIphone.constriur("Iphone11");
//        System.out.println(device.getModelo());
//        device = FactoryIphone.constriur("IphoneX");
//        System.out.println(device.getModelo());

        Semaforo semaforo1 = new Semaforo();
        semaforo1.mostrarAviso();
        semaforo1.cambiarEstado();
        semaforo1.mostrarAviso();
        semaforo1.cambiarEstado();
        semaforo1.mostrarAviso();
        semaforo1.cambiarEstado();

    }
}
