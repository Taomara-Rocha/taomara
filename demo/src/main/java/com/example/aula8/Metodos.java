package com.example.aula8;

import java.util.Scanner;


public class Metodos {

    public static void main(String[] args) {
      
        Utilidades.mostrarBoasVindas();
        Utilidades.saudar("Taomara");
    
        int numero = 5;
        Utilidades.dobro(numero);

        double n1 = 7.5;
        double n2 = 8.0;
        Utilidades.calcularMedia(n1, n2);

        boolean ehMaiorDeIdade = Utilidades.ehMaiorDeIdade(17);
        if (ehMaiorDeIdade) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }

        int somar = Utilidades.somar(3, 4);
        System.out.println("A soma de 3 e 4 é: " + somar);

        String saudacao = "Olá!";
        System.out.println(saudacao);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        Utilidades.saudacao(nome);

    
    }   

}
