package com.company;

public class Pelota extends Producto{

    private double radio;

    public Pelota(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        return 4*(3.1416)*radio*radio*radio/3;
    }
}
