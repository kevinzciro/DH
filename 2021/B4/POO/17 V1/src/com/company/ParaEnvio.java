package com.company;

public class ParaEnvio implements EstadoReparacion{

    private Reparacion r;

    public ParaEnvio(Reparacion r) {
        this.r = r;
        System.out.println("Reparado, ingresar direccion para el envio.");
//        System.out.println(r.toString());
    }


    @Override
    public void CambiarDireccion(String nuevaDiireccion) {
        r.setDireccionEntrega(nuevaDiireccion);
    }

    @Override
    public void valorReparacion(double nuevoPresupuesto) {
        System.out.println("Ya se calculo el costo de la reparacion.");
    }

    @Override
    public void valorRepuesto (double repuesto) {
        System.out.println("Ya se sumo el valor de los repuestos.");
    }

    @Override
    public void pasarDeEstado() {
        this.r.setEstado(new Finalizado(this.r));
    }
}
