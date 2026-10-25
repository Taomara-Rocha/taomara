package com.example.atividadeEncapsulamento;

public class ContaBancaria {

        private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    // Construtor vazio - usado no exercício 2,3,4
    public ContaBancaria() {}

    // Construtor com titular - se algum exercício antigo usar
    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    // --- EXERCÍCIO 2: porta de leitura ---
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Alias que seu Exercicio4 usava: getterSaldo()
    public double getterSaldo() {
        return getSaldo();
    }

    // --- EXERCÍCIO 6: só getter, sem setter ---
    public String getNumeroConta() {
        return numeroConta;
    }

    // --- EXERCÍCIO 3: porta de escrita com porteiro ---
    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido! Mantido " + this.titular);
            return;
        }
        this.titular = titular;
    }

    // --- EXERCÍCIO 4: métodos que trabalham ---
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        this.saldo += valor;
        registrarLog("deposito de " + valor);
        System.out.println("Saldo: " + saldo);
    }

    public void sacar(double valor) {
        if (!temSaldo(valor)) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.saldo -= valor;
        registrarLog("saque de " + valor);
        System.out.println("Saldo: " + saldo);
    }

    private boolean temSaldo(double valor) {
        return this.saldo >= valor;
    }

    private void registrarLog(String acao) {
        System.out.println("[LOG] " + titular + ": " + acao);
    }
}