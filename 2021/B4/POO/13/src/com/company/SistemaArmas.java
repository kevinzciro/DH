package com.company;

public abstract class SistemaArmas {

    private Integer energia;

    public SistemaArmas(Integer energia) {
        this.energia = energia;
    }


    public Integer getEnergia() {
        return this.energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }
}
