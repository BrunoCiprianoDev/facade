package org.example.classes;

public class Cliente {

    public boolean realizarOperacao() {
        return ClienteFacade.verificarPendencias(this);
    }
}
