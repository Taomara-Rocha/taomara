package com.example.aulaArrayDeque;

import java.util.ArrayDeque;

public class Exercicio6 {

    public static void main(String[] args) {

        ArrayDeque<String> fila = new ArrayDeque<>();

        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        }

        else {
            System.out.println("Próximo: " + (fila.peek()));
        }
    
            fila.add("Edu");

                   if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        }

        else {
            System.out.println("Próximo: " + (fila.peek()));
        }
  
    }
}
    
    
