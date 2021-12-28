package com.company;

public abstract class Proyecto {
    private Integer id;
    private String nombre;
    private String ciudadRealizacion;
    private String status;
    private Construccion construccion;

    public Proyecto(Integer id, String nombre, String ciudadRealizacion, String status, Construccion construccion) {
        this.id = id;
        this.nombre = nombre;
        this.ciudadRealizacion = ciudadRealizacion;
        this.status = status;
        this.construccion = construccion;
    }

    public Boolean finalizoFecha() {
        if (this.construccion.getFechaFinalizacionReal().equals(this.construccion.getFechaFinalizacionPrevista())
                && this.status.equals("finalizado")){
            return true;
        }
        return false;
    }
}
