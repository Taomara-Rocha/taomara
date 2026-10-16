package com.example.atividadeHashSet;

import java.util.HashSet;

/*Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
   imprima o isEmpty() de novo. */
   
public class Exercicio6 {

    public static void main(String[] args) {

        HashSet<String> frutas = new HashSet<>();

        System.out.println(frutas.isEmpty());
        frutas.add("Banana");
        System.out.println(frutas.isEmpty());
    }

}
