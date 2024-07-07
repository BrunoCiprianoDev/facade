package org.example.classes;

public class Atendimento extends Setor {

    private static Atendimento atendimento = new Atendimento();

    private Atendimento() {};

    public static Atendimento getInstancia() {
        return atendimento;
    }
}