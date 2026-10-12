package com.example.atividadeHashSet;

import java.util.HashSet;
import java.util.List;

/*Crie um HashSet de cores usando addAll. Depois use contains dentro
   de um if para avisar se a cor "verde" já está no conjunto ou não. */

public class Exercxicio2 {

    public static void main(String[] args) {
        
    HashSet<String> cores = new HashSet<>();

    cores.addAll(List.of("azul", "amarelo", "vermelho", "rosa", "preto"));

    if (cores.contains ("verde")) {
        System.out.println("A cor verde está no conjunto");
    }
    else {
        System.out.println("A cor verde não está no conjunto");
    }

        System.out.println("Conjunto: " + cores);
        
    }







    


    

}
