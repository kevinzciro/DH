package com.company;

/* Interface para implementar los estados, es decir los metodos que debera tener cada estado */
public interface EstadoReparacion {

    void CambiarDireccion(String nuevaDiireccion);

    void valorReparacion(double nuevoPresupuesto);

    void valorRepuesto(double repuesto);

    void pasarDeEstado();

}
