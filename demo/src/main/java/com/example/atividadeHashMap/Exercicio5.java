package com.example.atividadeHashMap;

import java.util.HashMap;

/* Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
   Remova uma delas e imprima de novo. */

public class Exercicio5 {

    public static void main(String[] args) {

        HashMap<String, Integer> notas = new HashMap<>();
        notas.put("Ana", 8);
        notas.put("Bia", 9);
        notas.put("Carla", 7);

        System.out.println(notas);
        System.out.println("Tamanho: " + notas.size());

        notas.remove("Bia");
        System.out.println(notas);
        System.out.println("Tamanho: " + notas.size());


    }
}
