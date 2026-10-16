package com.example.atividadeHashMap;

import java.util.HashMap;

/*Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
   dentro de um if para mostrar o telefone de alguém que está na agenda
   e de alguém que não está. */

public class Exercicio3 {

    public static void main(String[] args) {

        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Ana", "11 99999 9999");
        agenda.put("Bia", "11 11111 1111");

        if (agenda.containsKey("Ana")) {
            System.out.println(agenda.get("Ana"));
        } else {
            System.out.println("Nenhum telefone cadastrado para Ana");
        }

        if (agenda.containsKey("Carla")) {
            System.out.println(agenda.get("Carla"));
        }
        else {
            System.out.println("Nenhum telefone cadastrado para Carla");
        }
    }       
}
