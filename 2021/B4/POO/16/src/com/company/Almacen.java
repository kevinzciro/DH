package com.company;

import java.util.ArrayList;

public class Almacen<Productos> {

    private ArrayList<Producto> almacen;

    public Almacen(){

        almacen = new ArrayList<>();

        Caja caja1 = (Caja) ProductoFactory.getInstance().crearProducto("CAJA10X10");
        Pelota pelota1 = (Pelota) ProductoFactory.getInstance().crearProducto("PELOTAFULTBOL");
        Pelota pelota2 = (Pelota) ProductoFactory.getInstance().crearProducto("PELOTATENIS");

        almacen.add(caja1);
        almacen.add(pelota1);
        almacen.add(pelota2);
    }

    public double calcularEspacioNecesario(){
        double volumenTotal = 0;

        for(Producto pro: almacen)
            volumenTotal += pro.calcularEspacio();

        return volumenTotal;
    }
}
