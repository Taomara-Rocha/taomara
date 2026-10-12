package com.excecoes;



public class Exercicio6 {


    public static void main(String[] args) {
        
    String[] nomes = {"Edu", "Biel", "Junior"};

    try {
    System.out.println(nomes[5]);
} 
        catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Essa posição não existe.");
    
        }
        System.out.println("O programa continua funcionando");


    }

    }