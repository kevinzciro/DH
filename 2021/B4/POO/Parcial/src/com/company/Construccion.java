package com.company;

public class Construccion {

    private String direccion;
    private String fechaInicio;
    private String fechaFinalizacionPrevista;
    private String fechaFinalizacionReal;

    public Construccion(String direccion, String fechaInicio, String fechaFinalizacionPrevista, String fechaFinalizacionReal) {
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacionPrevista = fechaFinalizacionPrevista;
        this.fechaFinalizacionReal = fechaFinalizacionReal;
    }


    public String getFechaFinalizacionPrevista() {
        return fechaFinalizacionPrevista;
    }

    public String getFechaFinalizacionReal() {
        return fechaFinalizacionReal;
    }
}
