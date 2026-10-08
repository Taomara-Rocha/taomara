package com.example.revisao1;

import java.util.Scanner;

//Crie uma classe chamada Produto com os atributos nome (String) e preco (double).
//Na classe principal, faça um laço for que repita 3 vezes.
//A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
//Instancie um novo Produto e guarde nele os valores digitados.
//Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!". Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.


public class Exercicio5 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            Produto produto = new Produto(nome, preco);

            if (preco > 100) {
                System.out.println("Produto caro!");
            } else {
                System.out.println("Produto com preço acessível!");
            }
        }

        scanner.close();
    }
}