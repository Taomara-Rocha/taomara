package com.example.revisao1;

// Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
//1 - Ver camisas
//2 - Ver calças
//3 - Sair
//Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.

public class Exercicio3 {

   public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Ver camisas");
            System.out.println("2 - Ver calças");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu ver camisas.");
                    break;
                case 2:
                    System.out.println("Você escolheu ver calças.");
                    break;
                case 3:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }


}
