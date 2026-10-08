package com.example.estruturaRepeticao;

//Crie uma variável com um número e mostre a tabuada dele de 1 a 10.


public class Exercicio4 {


    public static void main(String[] args) {

        int numero = 5;

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

}
