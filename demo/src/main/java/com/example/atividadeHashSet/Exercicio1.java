package com.example.atividadeHashSet;

import java.util.HashSet;

/*/Crie um HashSet de nomes e adicione quatro valores, sendo um deles
   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
   com o repetido. */

public class Exercicio1 {

    public static void main(String[] args) {

        HashSet<String> nomes = new HashSet<>();

        nomes.add("Eduardo");
        nomes.add("Gabriel");
        nomes.add("Eduardo");
        nomes.add("Junior");

        System.out.println("Tamanho: " + nomes);
        System.out.println("Tamanho: " + nomes.size());

}
}
