package com.example.collecctions;

import java.util.ArrayList;

public class ExercicioCidade {


    public static void main(String[] args) {
        

        ArrayList<String> Lista = new ArrayList<>();

        Lista.add("São Paulo");
        Lista.add("Jundiaí");
        Lista.add("Barueri");
        Lista.add("Rio de Janeiro");

        System.out.println(Lista);

        Lista.remove(2);
        System.out.println(Lista);
    }

}
