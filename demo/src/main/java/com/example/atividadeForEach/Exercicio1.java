package com.example.atividadeForEach;

/*Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
   um por linha.
 */

public class Exercicio1 {

    public static void main(String[] args) {

        String[] nomes = {"Junior", "Taomara", "Eduardo", "Gabriel"};
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }   

}
