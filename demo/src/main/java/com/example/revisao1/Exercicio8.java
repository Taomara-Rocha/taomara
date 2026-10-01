package com.example.revisao1;

//Exemplo de execução:
//Deseja iniciar? Pressione 1 continuar, 2 para sair1
//Nota 1: 8.0
//Nota 2:7.0
//Nome da Aluna:Maria Silva
//O nome da aluna é Maria Silva, sua primeira nota foi 8.0, sua segunda nota foi 7.0, e sua média final foi 7.5. Aluna aprovada: true
//Deseja iniciar? Pressione 1 continuar, 2 para sair 5
//Opção inválida.
//Deseja iniciar? Pressione 1 continuar, 2 para sair 2
//Encerrando o sistema. Até logo!
//Bônus:
//Se terminar e quiser ir além
//Faça o programa mostrar "Aprovada" ou "Reprovada" em vez de true / false,
//Adicione uma opção no menu que mostra quantas alunas já foram cadastradas até agora
//Não deixe cadastrar nota menor que 0 ou maior que 10


public class Exercicio8 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcao;
        int contadorAlunas = 0;

        do {
            System.out.println("Deseja iniciar? Pressione 1 para continuar, 2 para sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nota 1: ");
                    double nota1 = scanner.nextDouble();
                    while (nota1 < 0 || nota1 > 10) {
                        System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
                        System.out.print("Nota 1: ");
                        nota1 = scanner.nextDouble();
                    }

                    System.out.print("Nota 2: ");
                    double nota2 = scanner.nextDouble();
                    while (nota2 < 0 || nota2 > 10) {
                        System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
                        System.out.print("Nota 2: ");
                        nota2 = scanner.nextDouble();
                    }

                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Nome da Aluna: ");
                    String nomeAluna = scanner.nextLine();

                    double mediaFinal = (nota1 + nota2) / 2;
                    boolean aprovada = mediaFinal >= 7.0;

                    System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f, e sua média final foi %.1f. Aluna aprovada: %b%n",
                            nomeAluna, nota1, nota2, mediaFinal, aprovada);

                    contadorAlunas++;
                    break;
                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 2);

        System.out.printf("Total de alunas cadastradas: %d%n", contadorAlunas);
        scanner.close();
    } 



}
