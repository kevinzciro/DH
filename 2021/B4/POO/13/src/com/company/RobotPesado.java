package com.company;

public class RobotPesado extends SistemaArmas implements VehiculosTerrestres {

    public RobotPesado() {
        super(10000);
    }

    @Override
    public void atacar() {
        System.out.println("Atacar!");
    }

    @Override
    public void defender() {
        System.out.println("Defender!");
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrar!");
    }
}
