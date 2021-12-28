package com.company;

public class ContenidoFactory {

    private static ContenidoFactory contenidoFactory = null;

    public static final String CARGA_SIMPLE = "CARGA_SIMPLE";
    public static final String CONTENEDOR = "CONTENEDOR";

    private ContenidoFactory(){

    }

    public static ContenidoFactory getInstancia(){
        if(contenidoFactory == null)
            contenidoFactory = new ContenidoFactory();

        return contenidoFactory;
    }


    public static Contenido construir(String tipo){

        switch (tipo){
            case CARGA_SIMPLE:
                return new CargaSimple();
            case CONTENEDOR:
                return new Contenedor();
            default:
                System.out.println("No se encontro el objeto a definir");
                return null;
        }
    }


}
