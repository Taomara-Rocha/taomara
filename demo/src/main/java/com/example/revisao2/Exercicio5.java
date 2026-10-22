package com.example.revisao2;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // 2 - Par ou ímpar
        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        // 3 - Maior entre dois
    
        System.out.println("Digite dois números:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if (n1 > n2) {
            System.out.println("Maior: " + n1);
        } else if (n2 > n1) {
            System.out.println("Maior: " + n2);
        } else {
            System.out.println("São iguais!");
        }

        // 4 - Nota
       
        System.out.println("Digite a nota:");
        double nota = scanner.nextDouble();
        if (nota >= 7) {
            System.out.println("Aprovada");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovada");
        }

        // 5 - Sorvete com switch
   
        System.out.println("Escolha 1, 2 ou 3:");
        int op = scanner.nextInt();
        switch (op) {
            case 1:
                System.out.println("Sabor: Chocolate");
                break;
            case 2:
                System.out.println("Sabor: Morango");
                break;
            case 3:
                System.out.println("Sabor: Creme");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        // 6 - Ingresso
        
        System.out.println("Qual sua idade para o ingresso?");
        int idadeIngresso = scanner.nextInt();
        if (idadeIngresso < 12 || idadeIngresso >= 60) {
            System.out.println("Ingresso: R$ 10");
        } else {
            System.out.println("Ingresso: R$ 25");
        }

        // 7 - Mini-desafio Triângulo
        
        System.out.println("Digite os 3 lados:");
        double l1 = scanner.nextDouble();
        double l2 = scanner.nextDouble();
        double l3 = scanner.nextDouble();

        if (l1 == l2 && l2 == l3) {
            System.out.println("Equilátero - todos iguais");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("Isósceles - dois iguais");
        } else {
            System.out.println("Escaleno - todos diferentes");
        }

        scanner.close();
    }
}
