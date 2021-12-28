package com.company;

public class UsuarioJuego {

    private String nombre;
    private String clave;
    private Integer puntaje;
    private Integer nivel;

//    Constructor
    public UsuarioJuego(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0;
        this.nivel = 0;
    }

//    Metodos pedidos
    public void aumentarPuntaje() {
        this.puntaje += 1;
    }
    public void aumentarNivel() {
        this.nivel += 1;
    }
    public void bonus(Integer valor) {
        this.puntaje += valor;
    }

//    getters
    public Integer getNivel() {
        return nivel;
    }
    public Integer getPuntaje() {
        return puntaje;
    }
    public String getClave() {
        return clave;
    }
    public String getNombre() {
        return nombre;
    }

//    Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }
}
