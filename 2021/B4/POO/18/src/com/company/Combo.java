package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Figuras{

    private List<Figuras> partesTren;

    public Combo() {
        this.partesTren = new ArrayList<>();
    }

    public void addFigura(Figuras f){
        partesTren.add(f);
    }

    @Override
    public double calcularArea() {
        Double areaTotalCombo = 0.0;
        for (Figuras f : partesTren) {
            areaTotalCombo += f.calcularArea();
        }
        return areaTotalCombo;
    }
}
