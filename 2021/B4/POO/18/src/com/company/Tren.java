package com.company;

import java.util.ArrayList;
import java.util.List;

public class Tren {

    private List<Figuras> Tren;

    public Tren() {
        this.Tren = new ArrayList<>();
    }

    public void add(Figuras f){
        Tren.add(f);
    }

    public double calcularArea() {
        Double areaTotalCombo = 0.0;
        for (Figuras f : Tren) {
            areaTotalCombo += f.calcularArea();
        }
        return areaTotalCombo;
    }

}
