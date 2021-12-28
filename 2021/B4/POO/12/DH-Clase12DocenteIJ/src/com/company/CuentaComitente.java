package com.company;

import java.util.Scanner;

public class CuentaComitente extends Cuenta{

    private String CNV;

    public void setCNV(String CNV) {
        this.CNV = CNV;
    }

    @Override
    public void depositar(double monto) {
        this.setSaldo(this.informarSaldo()+0.99*monto);
    }

    @Override
    public void extraer(double monto) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el CNV: ");
        String ingresado = entrada.nextLine();

        if (ingresado.equals(this.CNV)) {
            if (informarSaldo()>=monto) {
                this.setSaldo(informarSaldo()-monto);
            }
        }
        else{
            if (informarSaldo()*0.5>=monto) {
                this.setSaldo(informarSaldo()-(monto));
            }
        }

    }
}
