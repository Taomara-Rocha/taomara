package com.example.atividadeEncapsulamento;

public class Exercicio3 {

    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria();

        //System.out.println("Titular: " + c.getterTitular());
        //System.out.println("Saldo: " + c.getterSaldo());

        c.setTitular("");
        System.out.println("Titular: " + c.getterTitular());
        //System.out.println("Saldo: " + c.getterSaldo());

        c.setterTitular("Ana");
        System.out.println("Titular: " + c.getterTitular());
        //System.out.println("Saldo: " + c.getterSaldo());

    }

}
