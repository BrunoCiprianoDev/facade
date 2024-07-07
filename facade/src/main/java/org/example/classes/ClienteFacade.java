package org.example.classes;

public class ClienteFacade {

    public static boolean verificarPendencias(Cliente cliente) {
        if (Atendimento.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Marketing.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}