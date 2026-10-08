package com.example.collecctions;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioNome {

    public static void main(String[] args) {
 
    ArrayList<String> Lista = new ArrayList<>();

    //ArrayList<Integer> Lista = new ArrayList<>();
        
       
        //Lista.addAll(List.of("João", "Maria", "José"));
        //System.out.println(Lista);
    
        //Lista.add("Gabriel");
        //Lista.add("Eduardo");
        //Lista.add("Junior");
        //Lista.add("Lucas");

        //System.out.println(Lista);
        //System.out.println(Lista.set(2,"Pedro"));
        //System.out.println(Lista);

        //Lista.addAll(List.of("Ana", "Marina", "Carla", "Fernanda", "Daniela", "Mariana"));
        //System.out.println(Lista);

       //for (int i = 0; i < Lista.size(); i++) {
            //System.out.println(i + ": " + Lista.get(i));
        //}

        Lista.addAll(List.of("Tainara", "Ismael", "Suelen", "Vania", "Mariana"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome para verificar se ele está na lista: ");
        String nome = scanner.nextLine();

        if (Lista.contains(nome)) {
            System.out.println("O nome " + nome + " está na lista.");
            System.out.println(Lista.indexOf(nome) + ": " + nome);
        } else {
            System.out.println("O nome " + nome + " não está na lista.");
        }

    }
}