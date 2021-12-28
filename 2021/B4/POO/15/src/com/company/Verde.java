package com.company;

public class Verde implements SemaforoState{

    private Semaforo s;

    public Verde(Semaforo s) {
        this.s = s;
    }

    @Override
    public void cambiarEstado() {
        s.setEstado(new Amarillo(s));
    }

    @Override
    public void mostrarAviso() {
        System.out.println("Verde");
    }
}
