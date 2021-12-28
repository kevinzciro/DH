package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UsuarioJuego primerUsuario = new UsuarioJuego("Jose", "abc123");
        System.out.println("Nombre: " + primerUsuario.getNombre());
        System.out.println("Clave: " + primerUsuario.getClave());
        System.out.println("Nivel: " + primerUsuario.getNivel());
        System.out.println("Puntaje: " + primerUsuario.getPuntaje());

        System.out.println("Despues de aumentar puntaje y nivel:");
        primerUsuario.aumentarPuntaje();
        System.out.println("Puntaje: " + primerUsuario.getPuntaje());
        primerUsuario.aumentarNivel();
        System.out.println("Nivel: " + primerUsuario.getNivel());

        System.out.println("Despues de aplicar bonus:");
        primerUsuario.bonus(10);
        System.out.println("Puntaje: " + primerUsuario.getPuntaje());
    }
}
