package com.example.aulaArrayDeque;

import java.util.ArrayDeque;
import java.util.List;


public class Exercicio5 {

    public static void main(String[] args) {

            ArrayDeque<String> fila = new ArrayDeque<>();

            fila.addAll(List.of("Roberta", "Taomara", "Luana"));
            System.out.println("Bia está na fila? " + fila.contains("Bia"));
            System.out.println("Zoe está na fila? " + fila.contains("Zoe"));

}
}
