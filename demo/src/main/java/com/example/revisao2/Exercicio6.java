package com.example.revisao2;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        
        // 1 - Loops
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        int energia = 3;
        while (energia > 0) {
            System.out.println("Jogando...");
            energia--;
        }

        System.out.println("Fim!");

        // 2 - Tabuada
        System.out.println("Digite um número:");
        int num = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= 10; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        
        // 3 - Par
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //4 - for
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

       // 5 - do while
        int energia1 = 3;
        do {
            System.out.println("Jogando...");
            energia1--;
        } while (energia1 > 0);
        

        // 6 - Mini-desafio
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura:");
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*While verifica antes, do-while verifica depois. O while pode não executar nenhuma vez, o do-while sempre executa pelo menos uma. */