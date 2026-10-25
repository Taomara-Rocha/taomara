package com.example.atividadeEncapsulamento;

public class Exercicio6 {

    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria();
        c.setTitular("Ana");

        System.out.println("Numero da conta: " + c.getNumeroConta());

        //c.setNumeroConta("999-Z");
    }
}


