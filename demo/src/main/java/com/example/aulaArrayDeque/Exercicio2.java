package com.example.aulaArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

public class Exercicio2 {


    public static void main(String[] args) {

        //Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
   //imprima a fila logo depois. Repare que ela não mudou.

   ArrayDeque<String> fila = new ArrayDeque<>();

   fila.addAll(List.of("Paula", "Claudia", "Aline", "Lilian", "Natalia"));

   System.out.println(fila.peek());
   System.out.println(fila);


    }
}
