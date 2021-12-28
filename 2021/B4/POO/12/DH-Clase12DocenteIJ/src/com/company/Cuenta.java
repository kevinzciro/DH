package com.company;

public abstract class Cuenta {

    private double saldo;

    public void depositar(double monto) {
        saldo += monto;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setSaldo(double saldo, String a){
        this.saldo = saldo;
    }

    public double informarSaldo(){
        return saldo;
    }


    public abstract void extraer(double monto);
    //public abstract void extraer(double monto, String moneda);
}
