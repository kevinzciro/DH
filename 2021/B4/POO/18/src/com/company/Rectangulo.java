package com.company;

public class Rectangulo implements Figuras{

    private double ancho;
    private double altura;

    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ancho*altura;
    }
}
