package com.example.revisao2;

import java.util.Scanner;

public class Exercicio7 {

    /*
Com {8, 5, 10, 4, 7}, conte quantas notas são maiores ou iguais a 7.

🔥 Mini-desafio — Crie um array com 5 nomes. Peça um nome pra pessoa e diga em qual posição ele está. Se não estiver na lista, avise.

💡 Crie uma variável valendo -1 antes do laço — ela significa "ainda não encontrei". Se achar, guarde a posição nela. Depois do laço, se ela ainda valer -1, é porque não estava na lista.
 */

    public static void main(String[] args) {
        
        String[] nomes = {"Ana", "Taomara", "Maria", "Paula", "Joana"};
        System.out.println(nomes[0]);
        System.out.println(nomes[2]);
        System.out.println(nomes[4]);

        int[] notas = {8, 6, 10, 7, 9};
        for (int nota : notas) {
            System.out.println(nota);
        }

        double soma = 0;
        double media = 0;
        for (int nota : notas) {
            soma += nota;
            media += nota;
        }
        media /= notas.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        int maior = -1;
        for (int nota : notas) {
            if (nota >= 7) {
                maior = notas.length;
            }
        }

        System.out.println("Maior: " + maior);

        // Mini-desafio
        Scanner scanner = new Scanner(System.in);
        String[] nomes2 = {"Ana", "Taomara", "Maria", "Paula", "Joana"};

        System.out.println("Qual é o nome da pessoa?");
        String nomeBuscado = scanner.nextLine();

        int posicao = -1;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBuscado)) {
                posicao = i;
                break;
            }
        }
        if (posicao == -1) {
            System.out.println("O nome não está na lista");
        }
        else {
            System.out.println("O nome " + nomeBuscado + " está na posição " + posicao);
        }

    }

}
