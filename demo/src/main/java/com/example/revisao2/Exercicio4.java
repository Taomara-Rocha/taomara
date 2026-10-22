package com.example.revisao2;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");

        System.out.println("Qual é a sua idade?");
        int idade = scanner.nextInt();
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos e vai fazer " + (idade + 1) + " anos no próximo aniversário.");

        System.out.println("Digite um número? ");
        int numero = scanner.nextInt();
        System.out.println("Digite outro número? ");
        int numero2 = scanner.nextInt();

        System.out.println("Soma: " + (numero + numero2));

        System.out.println("Qual é a sua altura?");
        double altura = scanner.nextDouble();
        System.out.println("Qual é o seu peso?");
        double peso = scanner.nextDouble();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos, sua altura é " + altura + " metros e pesa " + peso + " kg.");
    

        // Mini-desafio
        System.out.println("Qual é o seu nome?");
        scanner.nextLine();
        String nome2 = scanner.nextLine();
        System.out.println("Qual é a sua idade?");
        int idade2 = scanner.nextInt();
        System.out.println("Qual é a sua cidade?");
        scanner.nextLine();
        String cidade = scanner.nextLine();

        System.out.println("Olá, " + nome2 + "! Você tem " + idade2 + " anos. Você vive em " + cidade + ".");

    }


}
