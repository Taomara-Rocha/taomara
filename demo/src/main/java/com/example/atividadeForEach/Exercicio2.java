package com.example.atividadeForEach;

import java.util.ArrayList;

//Crie um ArrayList com 5 notas e imprima todas usando for-each.


public class Exercicio2 {

    public static void main(String[] args) {

    ArrayList<Integer> notas = new ArrayList<>();

    notas.add(8);
    notas.add(9);
    notas.add(7);
    notas.add(10);
    notas.add(6);

    for (int nota : notas) {
        System.out.println(nota);
    }

}
}
