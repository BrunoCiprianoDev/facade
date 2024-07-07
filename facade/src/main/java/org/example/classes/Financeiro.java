package org.example.classes;

public class Financeiro extends Setor {

    private static Financeiro financeiro = new Financeiro();

    private Financeiro() {};

    public static Financeiro getInstancia() {
        return financeiro;
    }
}
