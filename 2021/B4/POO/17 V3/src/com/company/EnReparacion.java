package com.company;

public class EnReparacion implements EstadoReparacion{

    private Reparacion r;

    public EnReparacion(Reparacion r) {
        this.r = r;
        System.out.println("En reparacion, se agregara costo de los repuestos.");
//        System.out.println(r.toString());
    }


    @Override
    public void CambiarDireccion(String nuevaDiireccion) throws Exception{
        throw new Exception ("En reparacion: no se puede cambiar direccion.");
    }

    @Override
    public void valorReparacion(double nuevoPresupuesto) throws Exception{
        throw new Exception ("En reparacion: ya se calculo el costo de la mano de obra.");
    }

    @Override
    public void valorRepuesto(double repuesto) throws Exception {
        r.setCostoReparacion(r.getCostoReparacion() + repuesto);
    }

    @Override
    public void pasarDeEstado() throws Exception {
        this.r.setEstado(FabricaEstado.getInstancia().construir("ParaEnvio", r));
    }
}
