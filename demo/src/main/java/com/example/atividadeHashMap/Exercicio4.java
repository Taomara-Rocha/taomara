package com.example.atividadeHashMap;

import java.util.HashMap;

/* Crie um HashMap de estoque (produto -> quantidade) com dois itens.
   Use getOrDefault para mostrar a quantidade de um produto que existe
   e de um que não existe (devolvendo 0). Depois tente com get normal
   no que não existe e compare. */

public class Exercicio4 {

    public static void main(String[] args) {

    HashMap<String, Integer> estoque = new HashMap<>();
    estoque.put("café", 10);
    estoque.put("açucar", 5);

    System.out.println(estoque.getOrDefault("café", 0));
    System.out.println(estoque.getOrDefault("açucar", 0));
    System.out.println(estoque.getOrDefault("uva", 0));

    System.out.println(estoque.get("café"));
    System.out.println(estoque.get("banana"));
    System.out.println(estoque.get("uva"));

    //o getOrDefault faz com que não precisemos ficar fazendo If a todo momento, get mormal pode quebrar o código.

    }
}
