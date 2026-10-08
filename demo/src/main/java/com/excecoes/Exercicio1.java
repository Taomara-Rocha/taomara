package com.excecoes;

//Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
       
    int a;
    int b;
    int resultado;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        try {
            resultado = a / b;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");
        }

    }

}
