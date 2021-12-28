package com.company;

public class Main {

    public static void main(String[] args) {
        Cuenta ca;
//        ca = new CajaAhorro();
//        ca.setSaldo(100);
//        System.out.println(ca.informarSaldo());
//
//        ca = new CuentaCorriente();
//        ca.setSaldo(200);
//
//        System.out.println(ca.informarSaldo());
//        ((CuentaCorriente)ca).getDescubiertoPermitido();
//
//        if (ca instanceof CuentaCorriente){
//            ((CuentaCorriente)ca).getDescubiertoPermitido();
//        }

        ca = new CuentaComitente();
        ca.setSaldo(200.0);
        ca.depositar(100.0);
        System.out.println(ca.informarSaldo());
        ((CuentaComitente)ca).setCNV("abc123");
        ca.extraer(149.6);
        System.out.println(ca.informarSaldo());

   }
}
