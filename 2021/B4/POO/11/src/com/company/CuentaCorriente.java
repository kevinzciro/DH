package com.company;

public class CuentaCorriente extends Cuenta{

    private Double montoGirar;

    public CuentaCorriente(Cliente cliente, Double saldo, Integer numeroCuenta, Double montoGirar) {
        super(cliente, saldo, numeroCuenta);
        this.montoGirar = montoGirar;
    }

    public void setMontoGirar(Double montoGirar) {
        this.montoGirar = montoGirar;
    }

    public Double getMontoGirar() {
        return montoGirar;
    }

    @Override
    public void extraer(Double montoExtraer) {
        if (this.saldo + montoGirar >= montoExtraer) {
            if (this.saldo >= montoExtraer) {
                this.saldo -= montoExtraer;
            }
            else {
                setMontoGirar(this.saldo + this.montoGirar - montoExtraer);
                this.saldo = 0.0;
            }
        }
    }

}
