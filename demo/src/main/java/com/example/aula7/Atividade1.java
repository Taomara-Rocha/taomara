package com.example.aula7;

import java.util.Scanner;

//1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).
//2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.
//3 — Peça o nome da pessoa e mostre a primeira letra dele.
//4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
//Digite uma frase: Estou aprendendo Java
//Digite uma palavra: Java
//A palavra aparece na frase? true
//5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
//Digite seu nome: Ana
//Digite de novo: ANA
//Os nomes são iguais? true

public class Atividade1 {

    public static void main(String[] args) {

        String nome = "Ana Beatriz";


        //System.out.println(nome.length());
        //System.out.println(nome.toUpperCase());
        //System.out.println(nome.toLowerCase());
        //System.out.println(nome.charAt(0));
        //System.out.println(nome.contains("Beatriz"));

        //Scanner scanner = new Scanner(System.in);

       //System.out.println("Escreva uma frase:");
       //String frase = scanner.nextLine();

       //System.out.println("Escreva uma palavra:");
        //String palavra = scanner.nextLine();

        //System.out.println(frase.contains("Java"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome maiusculo:");
        String nomeMaiusculo = scanner.nextLine();
        
        System.out.println("Digite seu nome minusculo:");
        String nomeMinusculo = scanner.nextLine();
        
        System.out.println(nomeMinusculo.equalsIgnoreCase("Ana"));
       

    }


}
