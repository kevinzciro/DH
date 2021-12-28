package com.company;

public class Producto {

    private String nombreProducto;
    private String descripcion;
    private double precio;

    public Producto(String nombreProducto, String descripcion, double precio) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\n" + "{" + '\n'+
                '"' + "nombreProducto" + '"' + ": " +  '"' + nombreProducto + '"' +  "," + '\n' +
                '"' + "descripcion" + '"' + ": " + '"' + descripcion + '"' +  "," + '\n' +
                '"' + "precio" + '"' + ": " + precio + "," + '\n' +
                '}' ;
    }
}
