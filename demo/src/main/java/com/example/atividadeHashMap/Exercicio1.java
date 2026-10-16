package com.example.atividadeHashMap;

import java.util.HashMap;

/*Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
   inteiro e depois use get para mostrar a idade de uma delas. */

public class Exercicio1 {

    public static void main(String[] args) {

        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Ana", 20);
        pessoas.put("Bia", 21);
        pessoas.put("Carla", 22);

        System.out.println(pessoas);

        System.out.println(pessoas.get("Bia"));
    }

}
