package com.example.atividadeForEach;

/*Com o array de notas {8, 6, 10, 7}, use for-each para somar
   todas e mostrar a soma e a média. */

public class Exercicio3 {

    public static void main(String[] args) {

        int[] notas = {8, 6, 10, 7};
        int soma = 0;
        int media = 0;

        for (int nota : notas) {
            soma += nota;
            media += nota;
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media / notas.length);
    }

}
