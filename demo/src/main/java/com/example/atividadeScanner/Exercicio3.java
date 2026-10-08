package com.example.atividadeScanner;

import java.util.Scanner;

//Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.


public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da aluna: ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("A aluna foi aprovada!");
        } else if (nota >= 5) {
            System.out.println("A aluna ficou de recuperação.");
        } else {
            System.out.println("A aluna foi reprovada.");
        }
    }

}
