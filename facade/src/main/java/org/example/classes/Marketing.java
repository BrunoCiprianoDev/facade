package org.example.classes;

public class Marketing extends Setor {

    private static Marketing marketing = new Marketing();

    private Marketing() {};

    public static Marketing getInstancia() {
        return marketing;
    }
}