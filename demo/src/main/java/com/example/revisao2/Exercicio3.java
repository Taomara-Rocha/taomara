package com.example.revisao2;

public class Exercicio3 {

    public static void main(String[] args) {
        
        String nome = "Ana";
        int idade = 28;
        double altura = 1.75;
        System.out.println(nome + " tem " + idade + " anos.");

        double nota1 = 8.0;
        double nota2 = 7.0;
        double media = (nota1 + nota2) / 2;
        System.out.printf("A média é: %.1f%n", media);

        double preco = 10.50;
        System.out.printf("O valor do produto é: %.2f%n", preco);

        System.out.printf("%s tem %d anos e %.1f metros de altura%n", nome, idade, altura);

        double total = 0;
        total += preco;
        total += preco;

        System.out.printf("Total: %.2f%n", total);

        // Mini-desafio
        String produto = "óleo";
        double preco1 = 6.90;
        String produto1 = "Café";
        double preco2 = 26.90;
        String produto2 = "Feijão";
        double preco3 = 9.90;

        System.out.printf("%s %.2f%n", produto, preco1);
        System.out.printf("%s %.2f%n", produto1,preco2);
        System.out.printf("%s %.2f%n",produto2, preco3);
        System.out.printf("Total: %.2f%n", preco1 + preco2 + preco3);
        
}
}

