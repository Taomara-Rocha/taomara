package com.example.atividadeForEach;

/*Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
   usando o índice. Deixe os dois na mesma classe e compare. */

public class Exercicio5 {

    public static void main(String[] args) {

        String[] nomes = {"Junior", "Taomara", "Eduardo", "Gabriel"};
        for (String nome : nomes) {
            System.out.println(nome);

        String[] nomes2 = {"Junior", "Taomara", "Eduardo", "Gabriel"};

        for (int i = 0; i < nomes2.length; i++) {
            System.out.println(nomes2[i]);
        }
    }
}   // ambos mostratam o mesmo resultado, porém o for each é mais limpo
}
