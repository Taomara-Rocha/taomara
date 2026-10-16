package com.example.atividadeHashSet;

import java.util.ArrayList;
import java.util.HashSet;

/*Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
   tirar os repetidos. Imprima os dois e compare. */

public class Exercicio3 {

    public static void main(String[] args) {  
              
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Bia");
        lista.add("Carla");
        lista.add("Ana");
        lista.add("Bia");
        lista.add("Carla");
        lista.add("Ana");

        HashSet<String> repetidos = new HashSet<>(lista);

        System.out.println(lista);
        System.out.println(repetidos);
        
    // O ArrayList trouxe todos os nomes, meso que repetidos, enquanto o HashSet desconsiderou os repetidos.
    }

}
