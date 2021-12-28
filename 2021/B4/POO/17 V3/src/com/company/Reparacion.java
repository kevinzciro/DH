package com.company;

/*Se crea la clase reparacion*/
public class Reparacion {

    /* Se crea una variable de tipo EstadoReparacion para llevar registro del estado dela reparacion.
    Este estado puede tomar los valores: EnPresupuesto, EnReparacaion, ParaEnvio o Finalizado.
    EnPresupuesto solo se calcula el valor de la manode obra de la reparacion.
    EnReparacion solo se agrega el valor de los repuestos usados en la reparacion.
    ParaEnvio permite ingresar la direccion del envio del articulo ya reparado.
    Finalizado indica que el articulo ya se reparo y se envio.*/
    private EstadoReparacion estado;

    private String nombreArticulo;
    private double costoReparacion;
    private String direccionEntrega;

    /*constructor, lo hice pidiiendo solo el nombre del articulo pero se puede hacer pidiendo mas cosas*/
    public Reparacion(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
        this.costoReparacion = 0.0;

        /*se inicializa el estado DE ESTE OBJETO (donde dice r:this) en EnPresupuesto, es el primer estado que puede tener*/
        this.estado = new EnPresupuesto(this);
    }


    /*getters and setters*/
    public void setEstado(EstadoReparacion estado) {
        this.estado = estado;
    }
    public double getCostoReparacion() {
        return costoReparacion;
    }
    public void setCostoReparacion(double costo) {
        this.costoReparacion = costo;
    }
    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }


    /*metodo para cambiar la direccion a traves de los estados.
        Como solo se puede cambiar la direccion en el estado de ParaEnvio
        solo cuando el estado sea ParaEnvio no arrojara error*/
    public void CambiarDireccion(String nuevaDireccion) throws Exception {
        this.estado.CambiarDireccion(nuevaDireccion);
    }

    /*metodo para calcular el valor de la mano de obra a traves de los estados*/
    public void valorReparacion(double reparacion) throws Exception {
        this.estado.valorReparacion(reparacion);
    }

    /*metodo para agregar valor de repuestos a traves de los estados*/
    public void agregarRepuesto(double repuesto) throws Exception{
        this.estado.valorRepuesto(repuesto);
    }

    /*metodo para pasar de estados*/
    public void pasarDeEstado() throws Exception{
        this.estado.pasarDeEstado();
    }

    /*metodo toString para imprimir la reparacion cuando se necesite*/
    @Override
    public String toString() {
        return  "Nombre Articulo: " + nombreArticulo + "\n"
                + "Costo Reparacion: " + costoReparacion + "\n"
                + "Direccion Entrega: " + direccionEntrega + "\n"
                + "-------------------------------------------------";
    }
}
