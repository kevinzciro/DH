package com.company;

public class Rojo implements SemaforoState{

    private Semaforo s;

    public Rojo(Semaforo s) {
        this.s = s;
    }

    @Override
    public void cambiarEstado() {
        s.setEstado(new Verde(s));
    }

    @Override
    public void mostrarAviso() {
        System.out.println("Rojo");
    }
}
