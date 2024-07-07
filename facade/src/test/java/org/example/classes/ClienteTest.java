package org.example.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarPendenciaAtendimento() {
        Cliente cliente = new Cliente();
        Atendimento.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.realizarOperacao());
    }
    @Test
    void deveRetornarPendenciaMarketing() {
        Cliente cliente = new Cliente();
        Marketing.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.realizarOperacao());
    }

    @Test
    void deveRetornarClienteSemPendencia() {
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.realizarOperacao());
    }
    @Test
    void deveRetornarPendenciaFinanceiro() {
        Cliente cliente = new Cliente();
        Financeiro.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.realizarOperacao());
    }
}