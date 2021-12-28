package com.company;

public class Semaforo {
    private SemaforoState estado;

    public Semaforo() {
        this.estado = new Verde(this);
    }

    private SemaforoState getEstado() {
        return estado;
    }

    public void setEstado(SemaforoState estado) {
        this.estado = estado;
    }

    void mostrarAviso(){
        getEstado().mostrarAviso();
    }

    void cambiarEstado(){
        getEstado().cambiarEstado();
    }

}
