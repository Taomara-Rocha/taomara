package com.example.aulaArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

public class Exercicio4 {

    //Crie uma fila com três nomes e atenda todos usando
      //while (!fila.isEmpty()). No final, imprima "Fila vazia!".


        public static void main(String[] args) {

            ArrayDeque<String> fila = new ArrayDeque<>();
            
        fila.addAll(List.of("Eduardo", "Gabriel", "Junior"));

        while (!fila.isEmpty()) {
                System.out.println("Atendendo: " + fila.poll());

        }

        System.out.println(fila);
        System.out.println("Fila vazia!");

        }

}
