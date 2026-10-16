package com.example.atividadeHashMap;

import java.util.HashMap;

/*Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
   imprima, e depois faça put de "café" DE NOVO com valor 7.50.
   Imprima outra vez e veja o que aconteceu com o tamanho. */

public class Exercicio2 {

    public static void main(String[] args) {

        HashMap<String, Double> produtos = new HashMap<>();

        produtos.put("café", 5.00);
        System.out.println(produtos);
        System.out.println("Tamanho: " + produtos.size());

        produtos.put("café", 7.50);
        System.out.println(produtos);
        System.out.println("Tamanho: " + produtos.size());
    }
//No Hash Map ele não acrescenta se o valor já existir, mantem o mesmo.
}
