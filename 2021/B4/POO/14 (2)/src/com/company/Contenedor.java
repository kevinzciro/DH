package com.company;

import java.util.List;

public class Contenedor implements Comparable<Contenedor>{

    private Integer nroContenedor;
    private String procedencia;
    private boolean materialPeligroso;

    public Contenedor(Integer nroContenedor, String procedencia, boolean materialPeligroso) {
        this.nroContenedor = nroContenedor;
        this.procedencia = procedencia;
        this.materialPeligroso = materialPeligroso;
    }

    public Integer getNroContenedor() {
        return nroContenedor;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public boolean isMaterialPeligroso() {
        return materialPeligroso;
    }

    @Override
    public int compareTo(Contenedor contenedor) {
        Contenedor contenedorComparar = (Contenedor) contenedor;
        return (this.nroContenedor - contenedorComparar.nroContenedor);
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "nroContenedor=" + nroContenedor +
                ", procedencia='" + procedencia + '\'' +
                ", materialPeligroso=" + materialPeligroso +
                '}';
    }
}
