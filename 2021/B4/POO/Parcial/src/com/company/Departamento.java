package com.company;

public class Departamento extends Proyecto implements Comparable{

    private Integer cantidadPisos;
    private Integer departamentosPiso;

    public Departamento(Integer id, String nombre, String ciudadRealizacion, String status, Construccion construccion, Integer cantidadPisos, Integer departamentosPiso) {
        super(id, nombre, ciudadRealizacion, status, construccion);
        this.cantidadPisos = cantidadPisos;
        this.departamentosPiso = departamentosPiso;
    }


    @Override
    public int compareTo(Object departamento) {
        Departamento departamentoComparar = (Departamento) departamento;

        int cantidadDepartamentos = this.cantidadPisos * this.departamentosPiso;
        int cantidadDepartamentosComparar = departamentoComparar.cantidadPisos * departamentoComparar.departamentosPiso;

        return cantidadDepartamentos - cantidadDepartamentosComparar;
    }

    public boolean rascacielos() {
        return this.cantidadPisos > 15;
    }
}
