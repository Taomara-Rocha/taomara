package com.example.collecctions;

import java.util.ArrayList;
import java.util.List;

public class ExplicacaoArrayList {

    public static void main(String[] args) {

        /*add();
        get();
        size();
        contains();
        indexOf();
        remove();
        set();
        isEmpty();
        addAll (List.Of()); */

    //ArrayList<String> Lista = new ArrayList<>();

    ArrayList<Integer> Lista = new ArrayList<>(); //cria uma lista do tipo Integer (números inteiros)

    Lista.add(1); //adiciona o valor 1 na lista
    Lista.add(10);
    Lista.add(20);
    System.out.println(Lista);

    //Lista.addAll(List.of(30, 40, 50)); //adiciona os valores 30, 40 e 50 na lista
    //System.out.println(Lista);

    //Lista.remove (1); //remove o valor do índice 1 (posição) da lista, que é o valor 10 
    //System.out.println(Lista);
    //System.out.println(Lista.get(2));    //mostra o valor do índice 2 (posição) da lista, que é o valor 20

    //Lista.set(2,110); //substitui o valor do índice 2 (posição) pelo valor 110
    //System.out.println(Lista);

    //System.out.println(Lista.size()); //mostra o tamanho da lista

    System.out.println(Lista.contains(20)); //verifica se a lista contém o valor 20, retorna true ou false
    Lista.add(2,14); //adiciona o valor 14 na posição 2 da lista
    System.out.println(Lista.indexOf(30)); //mostra o índice (posição) do valor 30 na lista, retorna -1 se não encontrar o valor

}
}
