package com.company;

/* Interface para implementar los estados, es decir los metodos que debera tener cada estado */
public interface EstadoReparacion {

    void CambiarDireccion(String nuevaDiireccion) throws Exception;

    void valorReparacion(double nuevoPresupuesto) throws Exception;

    void valorRepuesto(double repuesto) throws Exception;

    void pasarDeEstado() throws Exception;

}
