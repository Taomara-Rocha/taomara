package com.excecoes;

import java.util.Scanner;

//Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0.

public class Exercicio5 {

    public static void main(String[] args) {
        
Scanner scanner = new Scanner (System.in);

try{
    System.out.println("Digite um numero: ");
    int numero = scanner.nextInt();

    int resto = 100 % numero;
    System.out.println("O resto da divisão de 100 por " + numero + " é: " + resto);
}
catch(ArithmeticException e){
System.out.println("Não é possível dividir por zero!");

}
    }
}
