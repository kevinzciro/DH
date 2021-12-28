package com.company;

public class Jugador implements Comparable<Jugador>{

    private Integer numeroCamiseta;
    private String nombre;
    private Boolean lesionado;
    private Boolean titular;

    public Jugador(Integer numeroCamiseta, String nombre, Boolean lesionado, Boolean titular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public Boolean getLesionado() {
        return lesionado;
    }

    public Boolean getTitular() {
        return titular;
    }

    public Integer getNumeroCamiseta() {
        return numeroCamiseta;
    }

    @Override
    public int compareTo(Jugador o) {
        return (this.numeroCamiseta - o.getNumeroCamiseta());
    }

    @Override
    public String toString() {
        return "Jugador :{" +
                "numero de Camiseta=" + numeroCamiseta +
                ", nombre del jugador='" + nombre + '\'' +
                '}';
    }
}
