package com.company;

import java.util.ArrayList;
import java.util.List;

public class Barco {
    private String nombre;
    private List<Contenido> contenidos;

    public Barco(String nombre) {
        this.nombre = nombre;
        this.contenidos = new ArrayList<Contenido>();
    }
    public void agregar(Contenido c) {
        this.contenidos.add(c);
    }

    public void mostrarInforme() {
        String informe = "Barco: " + nombre + "\n" + "Contenidos del barco: " + "\n";
        for (Contenido contenido : contenidos) {
            informe += contenido.toString();
        }
        System.out.println(informe);
    }
}
