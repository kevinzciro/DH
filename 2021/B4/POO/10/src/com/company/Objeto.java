package com.company;

public class Objeto {
    protected Integer posx;
    protected Integer posy;
    protected Character direccionVelocidad;

    public Objeto (Integer posx, Integer posy, Character direccion){
        this.posx = posx;
        this. posy = posy;
        this.direccionVelocidad = direccion;
    }

    public void irA(Integer nuevoX, Integer nuevoY, Character nuevaDireccion) {
        this.direccionVelocidad = nuevaDireccion;
        this.posx = nuevoX;
        this.posy = nuevoY;
    }
    
}
