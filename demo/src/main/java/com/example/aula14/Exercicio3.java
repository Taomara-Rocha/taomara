package com.example.aula14;

public class Exercicio3 {

    public static void main(String[] args) {

        Aluna aluna = new Aluna();
        aluna.nome = "Marcia";
        aluna.idade = 22;
        aluna.curso = "Java";

        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 23;
        flora.disciplina = "Java"; 
      
        aluna.apresentar();
        aluna.estudar();

        flora.apresentar();
        flora.lancarNota("Marcia", 8.5);
       
    }
}
