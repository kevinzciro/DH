package com.company;

import java.util.ArrayList;
import java.util.List;

public class Puerto {

    private String nombre;

    private List<Contenedor> contenedores;

    public Puerto(String nombre, List<Contenedor> contenedores) {
        this.nombre = nombre;
        this.contenedores = contenedores;
    }

    public Puerto(String nombre) {
        this.nombre = nombre;
        this.contenedores = new ArrayList<>();
    }

    public void addContenedor(Contenedor contenedor){
        this.contenedores.add(contenedor);
    }

    public void mostrarContenedores() {
        this.contenedores.sort(null);

        for (Contenedor contenedor: this.contenedores){
            System.out.println(contenedor);
        }
    }

    public Integer getCantidadContenedoresPeligrosos(){
        Integer peligrosos = 0;

        for (Contenedor contenedor: this.contenedores){
            if ( contenedor.isMaterialPeligroso() && contenedor.getProcedencia().equals("Desconocida") ){
                peligrosos++;
            }
        }

        return peligrosos;
    }


}
