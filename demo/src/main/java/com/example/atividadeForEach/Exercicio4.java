package com.example.atividadeForEach;

/*Com um array de nomes, use for-each e um if para contar quantos
   têm mais de 5 letras. Mostre o total. Dica: usem o método length. */

public class Exercicio4 {

    public static void main(String[] args) {

        String[] nomes = {"Junior", "Taomara", "Eduardo", "Gabriel", "Ana", "Bia", "Carla"};
        int contador = 0;

        for (String nome : nomes) {
            if (nome.length() > 5) {
                contador++;
            }
        }
        System.out.println("Total com mais de 5 letras: " + contador);

    }

}
