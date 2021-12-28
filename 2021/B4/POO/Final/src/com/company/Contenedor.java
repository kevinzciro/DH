package com.company;

import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Contenido {

    private List<Contenido> contenedor;
    private double pesoContenedor;

    public Contenedor() {
        super();
        this.contenedor = new ArrayList<>();
        this.pesoContenedor = 0;
    }

    public void setPesoContenedor(double pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }

    public void agregar(Contenido c){
        this.contenedor.add(c);
    }

    @Override
    public double calcularPeso() {
        double pesoTotalContenidos = 0.0;
        for (Contenido contenido : contenedor) {
            pesoTotalContenidos += contenido.calcularPeso();
        }
        return pesoTotalContenidos + this.pesoContenedor;
    }

    public String toString() {
        return "Nombre: " + this.getNombre() + ", " + "peso: " + this.calcularPeso() + "\n";
    }
}
