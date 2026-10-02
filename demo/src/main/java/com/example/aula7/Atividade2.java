package com.example.aula7;

import java.util.Scanner;

//4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

public class Atividade2 {

    public static void main(String[] args) {


        //1
        //String[] nomes = {"Ana", "Beatriz", "Carlos", "Daniel", "Eduardo"};
        //System.out.println("Primeiro: " + nomes[0]);
        //System.out.println("Terceiro: " + nomes[2]);
        //System.out.println("Último: " + nomes[4]);

        //2
        //int[] notas = {8, 6, 10, 7, 9};
        //for (int i = 0; i < notas.length; i++) {
            //System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        //}

        //3
        //int soma = 0;
       //for (int nota : notas) {
            //soma += nota;
        //}
        //double media = (double) soma / notas.length;
        //System.out.println("Soma: " + soma);
        //System.out.println("Média: " + media);

        //4
        //Scanner scanner = new java.util.Scanner(System.in);
        
        //int[] numeros = new int[5];
        //for (int i = 0; i < numeros.length; i++) {
           //System.out.print("Digite o número " + (i + 1) + ": ");
           //numeros[i] = scanner.nextInt();
        //}
        
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; 

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números de trás pra frente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);

        }
    }
    }


