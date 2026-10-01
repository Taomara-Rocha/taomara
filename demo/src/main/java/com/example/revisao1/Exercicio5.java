package com.example.revisao1;

//Crie uma classe chamada Produto com os atributos nome (String) e preco (double).
//Na classe principal, faça um laço for que repita 3 vezes.
//A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
//Instancie um novo Produto e guarde nele os valores digitados.
//Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!". Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.


public class Exercicio5 {

    public static void main(String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do scanner

            Produto produto = new Produto(nome, preco);

            if (produto.preco() > 100) {
                System.out.printf("Produto caro! O preço de %s é R$ %.2f%n", produto.nome(), produto.preco());
            } else {
                System.out.printf("Produto com preço acessível! O preço de %s é R$ %.2f%n", produto.nome(), produto.preco());
            }
        }

        scanner.close();
    }

}
