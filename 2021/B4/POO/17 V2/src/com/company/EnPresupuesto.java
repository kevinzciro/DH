package com.company;

public class EnPresupuesto implements EstadoReparacion{

    private Reparacion r;

    public EnPresupuesto(Reparacion r) {
        this.r = r;
        System.out.println("Calculando costo de la mano de obra.");
//        System.out.println(r.toString());
    }

    @Override
    public void CambiarDireccion(String nuevaDiireccion) throws Exception{
        throw new Exception ("En presupuesto: no se puede cambiar direccion");
    }

    @Override
    public void valorReparacion(double nuevoPresupuesto)throws Exception {
        r.setCostoReparacion(nuevoPresupuesto);
    }

    @Override
    public void valorRepuesto(double repuesto) throws Exception{
        throw new Exception ("En presupuesto: no se puede agregar costo de repuestos");
    }

    @Override
    public void pasarDeEstado() throws Exception {
        this.r.setEstado(new EnReparacion(this.r));
    }
}
