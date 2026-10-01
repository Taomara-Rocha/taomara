package com.example.aula8;

//Na mesma classe do main, crie um método chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main.
//Crie um método saudar(String nome) que imprime "Olá, [nome]! Tudo bem?". Chame ele três vezes, passando nomes diferentes.

public class Utilidades {

    static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao curso de Java!");
    }

    static void saudar(String nome) {
        System.out.println("Olá, " + nome + "! Tudo bem?");
    }
    static void dobro(int numero) {
        System.out.println("O dobro de " + numero + " é " + (numero * 2));
    }
    static void calcularMedia(double n1, double n2) {
        double media = (n1 + n2) / 2;
        System.out.printf("A média entre %.2f e %.2f é %.2f%n", n1, n2, media);
    }

    static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    static int somar(int a, int b) {
        return a + b;
    }

    static int somar(int a, int b, int c) {
        return a + b + c;
    }

    static double somar(double a, double b) {
        return a + b;
    }

    static void saudacao() {
        System.out.println("Olá!");
    }
    static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    
}

