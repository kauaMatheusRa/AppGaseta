package com.example.appgaseta.model;

public class Combustiveis {
    private float gasolina;
    private float etanol;

    public Combustiveis(){

    }

    public Combustiveis(float gasolina, float etanol) {
        this.gasolina = gasolina;
        this.etanol = etanol;
    }

    public float getGasolina() {
        return gasolina;
    }

    public void setGasolina(float gasolina) {
        this.gasolina = gasolina;
    }

    public float getEtanol() {
        return etanol;
    }

    public void setEtanol(float etanol) {
        this.etanol = etanol;
    }


    @Override
    public String toString() {
        return "Combustiveis{" +
                "gasolina='" + gasolina + '\'' +
                ", etanol='" + etanol + '\'' +
                '}';
    }
}
