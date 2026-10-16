package com.example.aula14;


public class Exercicio4 {


    public static void main(String[] args) {

        Aluna aluna = new Aluna();
        aluna.nome = "Marcia";
        aluna.idade = 22;
        aluna.curso = "Java";
        aluna.apresentar();


        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 23;
        flora.disciplina = "Java";
        flora.apresentar();
    
    }
}
