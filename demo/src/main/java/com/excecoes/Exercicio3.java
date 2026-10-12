package com.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        try {
            System.out.println("Digite a sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("Sua idade é: " + idade);
        
        } catch (InputMismatchException e) {
            System.out.println("Dados inválidos! Por favor, dogite um número.");

        } finally {
            scanner.close();
        }
    }
        
}

