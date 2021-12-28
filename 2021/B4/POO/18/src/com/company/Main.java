package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Figuras rectangulo1 = new Rectangulo(5,4);
        Figuras circulo1 = new Circulo(1);
        Figuras rectangulo2 = new Rectangulo(6,4);
        Figuras triangulo1 = new Triangulo(2,2);

        Combo vagon = new Combo();
        vagon.addFigura(rectangulo1);
        vagon.addFigura(circulo1);
        vagon.addFigura(circulo1);
        vagon.addFigura(circulo1);
        System.out.println("Area vagon: " + vagon.calcularArea());

        Combo locomotora = new Combo();
        locomotora.addFigura(rectangulo2);
        locomotora.addFigura(circulo1);
        locomotora.addFigura(circulo1);
        locomotora.addFigura(triangulo1);
        System.out.println("Area locomotora: " + locomotora.calcularArea());

        Tren tren1 = new Tren();
//        Combo tren1 = new Combo();
        tren1.add(vagon);
        tren1.add(locomotora);
        System.out.println("Area del tren: "  + tren1.calcularArea());

    }
}
