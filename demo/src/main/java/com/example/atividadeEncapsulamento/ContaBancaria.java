package com.example.atividadeEncapsulamento;

public class ContaBancaria {

    private String titular; 
    private double saldo;

    public String getterTitular() {
        return titular;
    }

    public double getterSaldo() {
        return saldo;
    }

    public String setterTitular(String titular) {
        this.titular = titular;
        return titular;
    }

    public double setterSaldo(double saldo) {
        this.saldo = saldo;
        return saldo;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido! Mantido atual: " + this.titular);
            return;
        }

        this.titular = titular;
    }

    public void depositar(double valor) {
    if (valor < 0) {
        System.out.println("Valor inválido! " + this.saldo);
        return;
       }
    }

    public void sacar(double valor) {
    if (!temSaldo(valor)) {
        System.out.println("Saldo insuficiente! " + this.saldo);
        return;
       }

    this.saldo = saldo - valor;
    registrarLog("Saque no valor de " + valor);

   }

    private boolean temSaldo(double valor) {
        return this.saldo >= valor;
    }

    private void registrarLog(String acao) {
        System.out.printf("[LOG]" + this.titular + ";" + acao);
    }   

    private String numeroConta = "001-X";
    public String getNumeroConta() {
        return numeroConta;
    }
}