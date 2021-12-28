package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Contenido tvLed = ContenidoFactory.construir("CARGA_SIMPLE");
        tvLed.setPesoContenido(3.0);
        tvLed.setNombre("TV Led");
        ((CargaSimple)tvLed).setRefrigerado(false);

        Contenido medicamentos = ContenidoFactory.construir("CARGA_SIMPLE");
        medicamentos.setPesoContenido(2.0);
        medicamentos.setNombre("Medicamentos");
        ((CargaSimple)medicamentos).setRefrigerado(true);

        Contenido evergreen = ContenidoFactory.construir("CONTENEDOR");
        evergreen.setNombre("Evergreen");
        ((Contenedor)evergreen).setPesoContenedor(100.0);
        ((Contenedor) evergreen).agregar(tvLed);
        ((Contenedor) evergreen).agregar(medicamentos);

        Barco POO = new Barco("POO");
        POO.agregar(tvLed);
        POO.agregar(medicamentos);
        POO.agregar(evergreen);

        POO.mostrarInforme();

    }
}
