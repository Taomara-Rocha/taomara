package com.example.collecctions;

import java.util.ArrayDeque;
import java.util.List;

public class ExplicacaoArrayDeque {

    public static void main(String[] args) {

    /*
        .add("Ana");
        .peek();
        .poll();
        .isEmpty();
        .size();
        .contains("Bia");
        .addAll(List.of("Ana","Bia"));
        */

        ArrayDeque<String> fila = new ArrayDeque<>(); 

        fila.add("Ana"); //adiciona a fila
        fila.add("Bia"); //adiciona a fila
        fila.addAll(List.of("Paula", "Claudia", "Aline", "Lilian")); //adiciona a fila
        System.out.println(fila); //imprime a fila
        System.out.println(fila.peek()); //
        System.out.println(fila.poll()); //
        //fila.poll(); //retira o primeiro elemento da fila

        System.out.println(fila.isEmpty()); //verifica se a fila está vazia
        System.out.println(fila.size()); //retorna o tamanho da fila

}
}
