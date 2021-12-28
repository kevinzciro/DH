package com.company;

public class Amarillo implements SemaforoState{

    private Semaforo s;

    public Amarillo(Semaforo s) {
        this.s = s;
    }

    @Override
    public void cambiarEstado() {
        s.setEstado(new Rojo(s));
    }

    @Override
    public void mostrarAviso() {
        System.out.println("Amarillo");
    }
}
