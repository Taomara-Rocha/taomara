package com.example.aulaArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

public class Exercicio3 {


        public static void main(String[] args) {


   ArrayDeque<String> fila = new ArrayDeque<>();

   fila.addAll(List.of("Paula", "Claudia", "Aline", "Lilian", "Natalia"));

   System.out.println(fila.poll());
   System.out.println(fila); //Nesse caso o poll atendeu a prozima pessoa da fila, enquanto noe xercicio anterior, o peek só"olhou" quem era a proxima pessoa da fila a ser atendida.

}
}
