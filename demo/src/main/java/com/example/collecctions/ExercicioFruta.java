package com.example.collecctions;

import java.util.ArrayList;
import java.util.List;

public class ExercicioFruta {

    public static void main(String[] args) {

        ArrayList<String> Lista = new ArrayList<>();
        //ArrayList<Integer> Lista = new ArrayList<>();

        Lista.addAll(List.of("Maçã" , "Uva" , "Laranja" , "Abacaxi"));
        System.out.println(Lista.get(0));
        System.out.println(Lista.get(3));
    
        System.out.println(Lista.size());

        
        }
    }




