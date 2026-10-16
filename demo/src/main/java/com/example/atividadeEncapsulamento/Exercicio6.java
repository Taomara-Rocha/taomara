package com.example.atividadeEncapsulamento;

public class Exercicio6 {

    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria();
        c.setTitular("Ana");
        c.depositar(500);
        c.depositar(-100);
        c.sacar(2000);
        c.sacar(200);

        System.out.println("Saldo: " + c.getterSaldo());

    }
   
}


