package com.company;

public class Nave extends Objeto{

    private Integer vida;
    private Double velocidad;

    public Nave(Integer posx, Integer posy, Character direccionVelocidad, Double velocidad) {
        super(posx, posy, direccionVelocidad);
        this.velocidad = velocidad;
        this.vida = 1000;
    }

//    public void girar( Character nuevaDireccion ) {
//        this.direccionVelocidad = nuevaDireccion;
//    }

    public void girar( Integer posx, Integer posy ){
        if (this.posx > ) {
        }
    }

    public void restaVida(Integer vidaRestar) {
        this.vida -= vidaRestar;
    }

    @Override
    public void irA(Integer nuevoX, Integer nuevoY, Character nuevaDireccion) {
        if ( this.direccionVelocidad.equals(nuevaDireccion) ) {
            super.irA(nuevoX, nuevoY, this.direccionVelocidad);
        }
        else {
            girar( nuevaDireccion );
            super.irA(nuevoX, nuevoY, this.direccionVelocidad);
        }
    }
}

