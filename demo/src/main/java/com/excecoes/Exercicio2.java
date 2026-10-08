package com.excecoes;

import java.util.Scanner;

//Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.


public class Exercicio2 {

    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    int[] notas = new int[5];
    System.out.println(notas.length);

  
    int posicao;
    System.out.print("Digite a posição da nota que deseja visualizar (0 a 4): ");
    posicao = scanner.nextInt();

    {
        try {
            System.out.println("A nota na posição " + posicao + " é: " + notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) 
        
        {
            System.out.println("Posição inválida! O array só vai de 0 a 4.");
        }
    }

}
}