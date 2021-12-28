package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Comprable> carrito;

    public Carrito() {
        this.carrito = new ArrayList<>();
    }
    public void addCarrito(Comprable comprable){
        this.carrito.add(comprable);
    }

    public Double calcularCosto(){
        Double precioTotalCarrito = 0.0;
        for (Comprable comprable : carrito) {
            precioTotalCarrito += comprable.calcularPrecio();
        }
        return precioTotalCarrito;
    }

}
