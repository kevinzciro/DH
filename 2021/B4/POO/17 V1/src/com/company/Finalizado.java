package com.company;

public class Finalizado implements EstadoReparacion{
    private Reparacion r;

    public Finalizado(Reparacion r) {
        this.r = r;
        System.out.println("Reparado y enviado.");
//        System.out.println(r.toString());
    }

    @Override
    public void CambiarDireccion(String nuevaDiireccion) {
        System.out.println("Ya se envio.");
    }

    @Override
    public void valorReparacion(double nuevoPresupuesto) {
        System.out.println("Ya se calculo el costo de la reparacion.");
    }

    @Override
    public void valorRepuesto(double repuesto) {
        System.out.println("Ya se sumo el valor de los repuestos.");
    }

    @Override
    public void pasarDeEstado() {
        System.out.println("Ya se reparo y se envio!");
    }
}
