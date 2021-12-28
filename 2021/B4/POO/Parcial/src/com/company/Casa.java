package com.company;

public class Casa extends Proyecto{
    private Double superficie;
    private Integer cantidadBanios;
    private Integer cantidadDormitorios;

    public Casa(Integer id, String nombre, String ciudadRealizacion, String status, Construccion construccion, Double superficie, Integer cantidadBanios, Integer cantidadDormitorios) {
        super(id, nombre, ciudadRealizacion, status, construccion);
        this.superficie = superficie;
        this.cantidadBanios = cantidadBanios;
        this.cantidadDormitorios = cantidadDormitorios;
    }
}
