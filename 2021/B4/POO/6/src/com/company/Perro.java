package com.company;

import java.time.LocalDateTime;

public class Perro {

    private Boolean enAdopcion;
    private String raza;
    private Integer anioNacimiento;
    private Double peso;
    private Boolean tieneChip;
    private Boolean estaLastimado;
    private String nombre;

//    Constructores
    public Perro(String nombre, String raza, Integer anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
        this.nombre = nombre;
        this.raza = raza;
        this.enAdopcion = false;
        this.peso = null;
        this.tieneChip = false;
        this.estaLastimado = false;
    }

    public Perro(String nombre, Double peso, Boolean estaLastimado) {
        this.anioNacimiento = null;
        this.nombre = nombre;
        this.raza = null;
        this.enAdopcion = false;
        this.peso = peso;
        this.tieneChip = false;
        this.estaLastimado = estaLastimado;
    }

//    Metodos pedidos
    public void edad() {
        System.out.println("edad: " + (LocalDateTime.now().getYear() - this.anioNacimiento));
    }

    public void sePuedePerder() {
        String siTieneChip = this.tieneChip ? "Tiene Chip, no se puede perder" : "No tiene Chip, se puede perder!!";
        System.out.println(siTieneChip);
    }

    public void sePuedeAdoptar() {
        if (this.peso > 5 && !estaLastimado){
            setEnAdopcion(true);
            System.out.println("Se puede adoptar");
       }
        else{
            System.out.println("No se puede adoptar");
        }
    }

//    getters y setters

    public Boolean getEnAdopcion() {
        return enAdopcion;
    }

    public void setEnAdopcion(Boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(Integer anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(Boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public Boolean getEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(Boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
