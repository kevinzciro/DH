package com.company;

public class Finalizado implements EstadoReparacion{
    private Reparacion r;

    public Finalizado(Reparacion r) {
        this.r = r;
        System.out.println("Reparado y enviado.");
//        System.out.println(r.toString());
    }

    @Override
    public void CambiarDireccion(String nuevaDiireccion) throws Exception {
        throw new Exception ("Ya se envio.");
    }

    @Override
    public void valorReparacion(double nuevoPresupuesto) throws Exception {
        throw new Exception ("Ya se calculo el costo de la reparacion.");
    }

    @Override
    public void valorRepuesto(double repuesto) throws Exception {
        throw new Exception ("Ya se sumo el valor de los repuestos.");
    }

    @Override
    public void pasarDeEstado() throws Exception {
        throw new Exception ("Ya se reparo y se envio!");
    }
}
