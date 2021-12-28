package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable{

    private List<Comprable> combo;
    private Double descuento;

    public Combo(Double descuento) {
        this.descuento = descuento;
        this.combo = new ArrayList<>();
    }
    public void  addCombo(Comprable comprable){
        this.combo.add(comprable);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotalCombo = 0.0;
        for (Comprable comprable : combo) {
            precioTotalCombo += comprable.calcularPrecio();
        }
        return precioTotalCombo - (precioTotalCombo * descuento/100);

    }
}
