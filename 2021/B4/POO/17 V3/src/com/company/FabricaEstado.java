package com.company;

public class FabricaEstado {

    private static FabricaEstado instancia;

    private FabricaEstado(){

    }

    public static FabricaEstado getInstancia(){
        if (instancia==null){
            instancia = new FabricaEstado();
        }
        return instancia;
    }

    public static EstadoReparacion construir(String tipoEstado, Reparacion r){
        switch (tipoEstado){
            case "EnPresupuesto":
                return new EnPresupuesto(r);
            case "EnReparacion":
                return new EnReparacion(r);
            case "ParaEnvio":
                return new ParaEnvio(r);
            case "Finalizado":
                return new Finalizado(r);
            default:
                System.out.println("Ingrese un estado correcto.");
                return null;
        }
    }

}
