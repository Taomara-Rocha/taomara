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

        fila.add("Ana");
        fila.add("Bia");
        fila.addAll(List.of("Paula", "Claudia", "Aline", "Lilian")); //
        System.out.println(fila);
        System.out.println(fila.peek()); //
        System.out.println(fila.poll()); //
        //fila.poll();

        System.out.println(fila.isEmpty());
        System.out.println(fila.size());

}
}
