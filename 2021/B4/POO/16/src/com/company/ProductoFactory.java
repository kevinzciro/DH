package com.company;

public class ProductoFactory {

    public static ProductoFactory instance;

    public ProductoFactory(){
    }

    public static ProductoFactory getInstance()
    {
        if(instance == null)
            instance = new ProductoFactory();

        return instance;
    }

    public Producto crearProducto(String cod) {
        Producto resultado = null;
        switch (cod) {
            case "CAJA10X10":
                resultado = new Caja(10,10,10);
                break;
            case "PELOTAFULTBOL":
                resultado = new Pelota(11);
                break;
            case "PELOTATENIS":
                resultado = new Pelota(0.32);
                break;
        }
        return resultado;
    }
}
