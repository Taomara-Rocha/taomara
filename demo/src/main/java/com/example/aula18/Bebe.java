package com.example.aula18;

public class Bebe {

    String nome;
    String dataNascimento;

    public Bebe(String nomeBebe, String dataNascimentoBebe) {

        //nome = nomeBebe;
        //dataNascimento = dataNascimentoBebe;

        this.nome = nomeBebe;
        this.dataNascimento = dataNascimentoBebe;

        System.out.println("O nome da bebe é: " + nome);
        System.out.println("A data de nascimento da bebe é: " + dataNascimento);
    }

}
