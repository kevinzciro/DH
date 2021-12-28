package com.company;

public class EnPresupuesto implements EstadoReparacion{

    private Reparacion r;

    public EnPresupuesto(Reparacion r) {
        this.r = r;
        System.out.println("Calculando costo de la mano de obra.");
//        System.out.println(r.toString());
    }

    @Override
    public void CambiarDireccion(String nuevaDiireccion) {
        System.out.println("En presupuesto: no se puede cambiar direccion");
    }

    @Override
    public void valorReparacion(double nuevoPresupuesto) {
        r.setCostoReparacion(nuevoPresupuesto);
    }

    @Override
    public void valorRepuesto(double repuesto) {
        System.out.println("En presupuesto: no se puede agregar costo de repuestos");
    }

    @Override
    public void pasarDeEstado() {
        this.r.setEstado(new EnReparacion(this.r));
    }
}
