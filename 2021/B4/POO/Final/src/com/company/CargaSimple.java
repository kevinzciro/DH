package com.company;

public class CargaSimple extends Contenido {

    private boolean refrigerado;

    public CargaSimple() {
        super();
        this.refrigerado = false;
    }

    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }

    @Override
    public double calcularPeso() {
        if (this.refrigerado) {
            return this.getPesoContenido()*(1 + 0.1);
        }
        return this.getPesoContenido();
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + ", " + "peso: " + this.calcularPeso() + "\n";
    }
}
