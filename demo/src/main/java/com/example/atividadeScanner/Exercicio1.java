package com.example.atividadeScanner;


import java.util.Scanner;

public class Exercicio1 {

    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos e vai fazer " + (idade + 1) + " no seu próximo aniversário.");

}

}
