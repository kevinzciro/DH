package com.company;

public class Cuenta {
    private int numeroDeCuenta;
    private Double saldo;

    //crear la funcion depositar y retirar aca
    public Cuenta(int numeroDeCuenta,  Double saldo){
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public void deposito(Double cantidadDinero){
        this.saldo +=  cantidadDinero;
    }

    public void retirar(Double cantidadDinero){
        if (this.saldo>= cantidadDinero ){
            this.saldo -= cantidadDinero;
        }
    }

    //no tocar estas funciones
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }
}
