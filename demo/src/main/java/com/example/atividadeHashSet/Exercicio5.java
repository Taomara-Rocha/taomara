package com.example.atividadeHashSet;

import java.util.HashSet;

/*. Crie um HashSet com três frutas e percorra ele com for,
   imprimindo uma por linha. */

public class Exercicio5 {

    public static void main(String[] args) {

        HashSet<String> frutas = new HashSet<>();
        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Uva");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
}
}