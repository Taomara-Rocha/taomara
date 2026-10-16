package com.example.atividadeHashSet;

import java.util.HashSet;

/*Crie um HashSet com três CPFs e imprima. Depois remova um deles e
   imprima de novo, junto com o tamanho. */

public class Exercicio4 {

    public static void main(String[] args) {

        HashSet<String> cpfs = new HashSet<>();
        cpfs.add("123.456.789-00");
        cpfs.add("987.654.321-00");
        cpfs.add("456.789.123-00");

        System.out.println("CPFs: " + cpfs);

        cpfs.remove("123.456.789-00");
        System.out.println("CPFs: " + cpfs);
        System.out.println("Quantidade de CPFs: " + cpfs.size());
    }

}
