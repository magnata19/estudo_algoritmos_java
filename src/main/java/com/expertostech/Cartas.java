package com.expertostech;

public class Cartas {
    private String nipe;
    private int numero;

    public Cartas(String nipe, int numero) {
        this.nipe = nipe;
        this.numero = numero;
    }

    public String getNipe() {
        return nipe;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "{ " + this.nipe + " - " + this.numero + " }";
    }

}