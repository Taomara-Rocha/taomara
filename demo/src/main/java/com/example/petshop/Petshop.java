package com.example.petshop;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Petshop {

    //public static void main(String[] args) {
               //1
          //String nome = "Mel";
          //String especie = "Cachorro";
          //double peso = 8.5;

    //System.out.println("=== FICHA DO PET ===");
    //System.out.println("Nome: " + nome);
    //System.out.println("Especie: " + especie);
    //System.out.printf("Peso: %.1f kg \n",  peso);

            //2
    //Scanner scanner = new Scanner (System.in);

    //System.out.println("=== FICHA DO PET ===");

    //System.out.println("Nome: ");
    //String nome = scanner.nextLine();

    //System.out.println("Especie: ");
    //String especie = scanner.nextLine();

    //System.out.println("Peso: ");
    //double peso = scanner.nextDouble();

    //if (peso < 10.00) {
        //System.out.println("Porte: Pequeno");

    //} else if (peso >= 10.00 && peso < 25.00) {
    //System.out.println("Porte: Médio");

    //} else  {
        //System.out.println("Porte: Grande");
    //}

    //scanner.close();
                //3
    //Scanner scanner = new Scanner(System.in);
    //Pet pet = new Pet();

    //System.out.println("=== FICHA DO PET ===");
    //System.out.println("Nome:");
    //String nome = scanner.nextLine();

    //System.out.println("Especie:");
    //String especie = scanner.nextLine();

    //System.out.printf("Peso:");
    //double peso = scanner.nextDouble();

    //if (peso < 10.00) {
        //System.out.println("Porte: Pequeno");

    //} else if (peso >= 10.00 && peso < 25.00) {
    //System.out.println("Porte: Médio");

    //} else  {
        //System.out.println("Porte: Grande");
    //}

        //scanner.close();

                //4
    //Pet meuPet = new Pet();
    //meuPet.nome = "Mel";
    //meuPet.especie = "Cachorro";
    //meuPet.peso = 8.5;
    //System.out.println(meuPet.definirPorte());

//Pet[] arrayPets = new Pet[5];
//arrayPets[0] = new Pet();
//arrayPets[0].nome = "Mel";
//arrayPets[0].especie = "Cachorro";
//arrayPets[0].peso = 8.5;
//arrayPets[0].porte = arrayPets[0].definirPorte();
//System.out.println("--- PETS CADASTRADOS ---");
//System.out.println(arrayPets[0].nome + " (" + arrayPets[0].especie + ") - " + arrayPets[0].peso + " kg - Porte " + //arrayPets[0].porte); 

//6,7,8,9
 //Scanner scanner = new Scanner(System.in);
        //Pet[] arrayPets = new Pet[10];
        //int total = 0;
        //int opcao = -1;

        //while (opcao!= 0) {
            //System.out.println("=== PETSHOP ===");
            //System.out.println("1 - Cadastrar pet");
            //System.out.println("2 - Listar pets");
            //System.out.println("3 - Buscar por nome");
            //System.out.println("0 - Sair");
            //System.out.print("Escolha: ");
            //opcao = scanner.nextInt();
            //scanner.nextLine();

            //if (opcao == 1) {
                //System.out.print("Nome: ");
                //String nome = scanner.nextLine();
                //System.out.print("Especie: ");
                //String especie = scanner.nextLine();
                //System.out.print("Peso: ");
                //double peso = scanner.nextDouble();
                //scanner.nextLine();

                //Pet pet = new Pet();
                //pet.nome = nome;
                //pet.especie = especie;
                //pet.peso = peso;
                //pet.porte = pet.definirPorte();

                //arrayPets[total] = pet;
                //total++;
                //System.out.println("Pet cadastrado!");

            //} else if (opcao == 2) {
                //if (total == 0) {
                    //System.out.println("Nenhum pet cadastrado!");//} else {
                    //System.out.println("--- PETS CADASTRADOS ---");
                    //for (int i = 0; i < total; i++) {
                        //System.out.println(arrayPets[i].nome + " (" + arrayPets[i].especie + ") - " + arrayPets[i].peso + " kg - Porte " + arrayPets[i].porte);
                    //}
                //}

            //} else if (opcao == 3) {
                //System.out.print("Qual pet voce procura? ");
                //String busca = scanner.nextLine();

                //boolean achou = false;
                //for (int i = 0; i < total; i++) {
                    //if (arrayPets[i].nome.equalsIgnoreCase(busca)) {
                        //System.out.println("Encontrado: " + arrayPets[i].nome + " (" + arrayPets[i].especie + ") - " + arrayPets[i].peso + " kg");
                        //achou = true;
                        //break;
                    //}
                //}

                //if (!achou) {
                    //System.out.println("Pet nao encontrado.");
                //}

            //} else if (opcao == 0) {
                //System.out.println("Ate logo!");
            //}
        //}
        //scanner.close();

                   //10
        //Scanner scanner = new Scanner(System.in);
        //Pet[] arrayPets = new Pet[10];
        //int total = 0;
        //int opcao = -1;

        //while (opcao!= 0) {
            //System.out.println("=== PETSHOP ===");
            //System.out.println("1 - Cadastrar pet");
            //System.out.println("2 - Listar pets");
            //System.out.println("3 - Buscar por nome");
            //System.out.println("0 - Sair");
            //System.out.print("Escolha: ");

            //try {
                //opcao = scanner.nextInt();
                //scanner.nextLine();

                //switch (opcao) {
                    //case 1:
                        //System.out.print("Nome: ");
                        //String nome = scanner.nextLine();
                        //System.out.print("Especie: ");
                        //String especie = scanner.nextLine();
                        //System.out.print("Peso: ");
                        //double peso = scanner.nextDouble();
                        //scanner.nextLine();

                        //Pet pet = new Pet();
                        //pet.nome = nome;
                        //pet.especie = especie;
                        //pet.peso = peso;
                        //pet.porte = pet.definirPorte();

                        //arrayPets[total] = pet;
                        //total++;
                        //System.out.println("Pet cadastrado!");
                        //break;

                    //case 2:
                        //if (total == 0) {
                            //System.out.println("Nenhum pet cadastrado!");
                        //} else {
                            //System.out.println("--- PETS CADASTRADOS ---");
                            //for (int i = 0; i < total; i++) {
                                //System.out.println(arrayPets[i].nome + " (" + arrayPets[i].especie + ") - " + arrayPets[i].peso + " kg - Porte " + arrayPets[i].porte);
                           //}
                        //}
                        //break;

                    //case 3:
                        //System.out.print("Qual pet voce procura? ");
                        //String busca = scanner.nextLine();
                        //boolean achou = false;
                        //for (int i = 0; i < total; i++) {
                            //if (arrayPets[i].nome.equalsIgnoreCase(busca)) {
                                //System.out.println("Encontrado: " + arrayPets[i].nome + " (" + arrayPets[i].especie + ") - " + arrayPets[i].peso + " kg");
                                //achou = true;
                                //break;
                            //}
                        //}
                        //if (!achou) {
                            //System.out.println("Pet nao encontrado.");
                        //}
                        //break;

                    //case 0:
                        //System.out.println("Ate logo!");
                        //break;

                    //default:
                        //System.out.println("Opcao invalida!");
                        //break;
                //}

            //} catch (InputMismatchException e) {
                //System.out.println("Digite apenas numeros!");
                //scanner.nextLine();
                //opcao = -1; 
            //}
        //}
        //scanner.close();

          //11

                  //Scanner scanner = new Scanner(System.in);
        //Pet[] arrayPets = new Pet[10];
        //int total = 0;
        //int opcao = -1;

        //while (opcao!= 0) {
            //System.out.println("=== PETSHOP ===");
            //System.out.println("1 - Cadastrar pet");
            //System.out.println("2 - Listar pets");
            //System.out.println("3 - Buscar por nome");
            //System.out.println("4 - Quantas especies diferentes");
            //System.out.println("0 - Sair");
            //System.out.print("Escolha: ");

            //try {
                //opcao = scanner.nextInt();
                //scanner.nextLine();

                //witch (opcao) {
                    //case 1:
                        //if (total >= arrayPets.length) {
                            //System.out.println("Limite de pets atingido!");
                            //break;
                        //}
                        //System.out.print("Nome: ");
                        //String nome = scanner.nextLine();
                        //System.out.print("Especie: ");
                        //String especie = scanner.nextLine();
                        //System.out.print("Peso: ");
                        //double peso = scanner.nextDouble();
                        //scanner.nextLine();

                        //Pet pet = new Pet();
                        //pet.nome = nome;
                        //pet.especie = especie;
                        //pet.peso = peso;
                        //pet.porte = pet.definirPorte();

                        //arrayPets[total] = pet;
                        //total++;
                        //System.out.println("Pet cadastrado!");
                        //break;

                    //case 2:
                        //if (total == 0) {
                            //System.out.println("Nenhum pet cadastrado!");
                        //} else {
                            //System.out.println("--- PETS CADASTRADOS ---");
                            //for (int i = 0; i < total; i++) {
                                //System.out.println(arrayPets[i]);
                            //}
                        //}
                        //break;

                    //case 3:
                        //System.out.print("Qual pet voce procura? ");
                        //String busca = scanner.nextLine();
                        //boolean achou = false;
                        //for (int i = 0; i < total; i++) {
                            //if (arrayPets[i].nome.equalsIgnoreCase(busca)) {
                                //System.out.println("Encontrado: " + arrayPets[i]);
                                //achou = true;
                                //break;
                            //}
                        //}
                        //if (!achou) {
                            //System.out.println("Pet nao encontrado.");
                        //}
                        //break;

                    //case 4:
                        //if (total == 0) {
                            //System.out.println("Nenhum pet cadastrado!");
                        //} else {
                            //HashSet<String> especies = new HashSet<>();
                            //for (int i = 0; i < total; i++) {
                                //especies.add(arrayPets[i].especie);
                            //}
                            //System.out.println("--- ESPECIES CADASTRADAS ---");
                            //for (String esp : especies) {
                                //System.out.println("- " + esp);
                            //}
                            //System.out.println("Total de especies diferentes: " + especies.size());
                        //}
                        //break;

                    //case 0:
                        //System.out.println("Ate logo!");
                        //break;

                    //default:
                        //System.out.println("Opcao invalida!");
                        //break;
                //}

            //} catch (InputMismatchException e) {
                //System.out.println("Digite apenas numeros!");
                //scanner.nextLine();
                //opcao = -1;
            //}
        //}
        //scanner.close();

        //12
        //Scanner scanner = new Scanner(System.in);
        //ArrayDeque<String> fila = new ArrayDeque<>();

    //while (true) {
            //System.out.println("=== FILA DE BANHO ===");
            //System.out.println("1 - Entrar na fila");
            //System.out.println("2 - Atender o próximo");
            //System.out.println("0 - Sair");
            //System.out.print("Escolha: ");
            //int opcao = scanner.nextInt();
            //scanner.nextLine();

            //if (opcao == 1) {
                //System.out.print("Nome do pet pra entrar na fila: ");
                //String nome = scanner.nextLine();
                //fila.add(nome);
                //System.out.println(nome + " entrou na fila.");
                //System.out.println("Fila agora: " + fila);

            //} else if (opcao == 2) {
                //if (fila.isEmpty()) {
                    //System.out.println("Fila vazia!");
                //} else {
                    //String próximo = fila.poll();
                    //System.out.println("Próximo da fila: " + próximo);
                    //System.out.println("Atendendo " + próximo + "...");
                    //System.out.println("Fila agora: " + fila);
                //}

            //} else if (opcao == 0) {
                //System.out.println("Ate logo!");
            //}
        
        //}
        //13

                //Scanner scanner = new Scanner(System.in);
        //Pet[] arrayPets = new Pet[10];
        //int total = 0;
        //Queue<String> filaBanho = new LinkedList<>();
        //int opcao = -1;

        //while (opcao!= 0) {
            //System.out.println("1 - Cadastrar pet");
            //System.out.println("2 - Listar pets");
            //System.out.println("3 - Buscar por nome");
            //System.out.println("4 - Especies diferentes");
            //System.out.println("5 - Executar servicos");
            //System.out.println("6 - Fila de Banho");
            //System.out.println("0 - Sair");
            //System.out.print("Escolha: ");

            //try {
                //opcao = scanner.nextInt();
                //scanner.nextLine();

                //switch (opcao) {
                    //case 1:
                        //System.out.print("Nome: ");
                        //String nome = scanner.nextLine();
                        //System.out.print("Especie: ");
                        //String especie = scanner.nextLine();
                        //System.out.print("Peso: ");
                        //double peso = scanner.nextDouble();
                        //scanner.nextLine();
                        //Pet pet = new Pet();
                        //pet.nome = nome;
                        //pet.especie = especie;
                        //pet.peso = peso;
                        //pet.porte = pet.definirPorte();
                        //arrayPets[total] = pet;
                        //total++;
                        //System.out.println("Pet cadastrado!");
                        //break;

                    //case 2:
                        //if (total == 0) System.out.println("Nenhum pet cadastrado!");
                        //else for (int i = 0; i < total; i++) System.out.println(arrayPets[i]);
                        //break;

                    //case 3:
                        //System.out.print("Qual pet voce procura? ");
                        //String busca = scanner.nextLine();
                        //boolean achou = false;
                        //for (int i = 0; i < total; i++) {
                            //if (arrayPets[i].nome.equalsIgnoreCase(busca)) {
                                //System.out.println("Encontrado: " + arrayPets[i]);
                                //achou = true;
                                //break;
                            //}
                        //}
                        //if (!achou) System.out.println("Pet nao encontrado.");
                        //break;

                    //case 4:
                        //if (total == 0) System.out.println("Nenhum pet cadastrado!");
                        //else {
                            //HashSet<String> especies = new HashSet<>();
                            //for (int i = 0; i < total; i++) especies.add(arrayPets[i].especie);
                            //System.out.println("--- ESPECIES CADASTRADAS ---");
                            //for (String esp : especies) System.out.println("- " + esp);
                            //System.out.println("Total: " + especies.size());
                        //}
                        //break;

                    //case 5:
                        //System.out.print("Nome do pet: ");
                        //String nomeDoPet = scanner.nextLine();
                        //ArrayList<servico> servicos = new ArrayList<>();
                        //servicos.add(new Banho());
                        //servicos.add(new Tosa());
                        //servicos.add(new Consulta());
                        //for (servico item : servicos) {
                            //item.executar(nomeDoPet);
                        //}
                        //break;

                    //case 6:
                        //System.out.println("\n--- FILA DE BANHO ---");
                        //System.out.println("1 - Entrar na fila");
                        //System.out.println("2 - Atender o proximo");
                        //System.out.println("0 - Voltar");
                        //System.out.print("Escolha: ");
                        //int opFila = scanner.nextInt();
                        //scanner.nextLine();
                        //if (opFila == 1) {
                            //System.out.print("Nome do pet: ");
                            //String n = scanner.nextLine();
                            //filaBanho.add(n);
                            //System.out.println(n + " entrou na fila!");
                        //} else if (opFila == 2) {
                            //if (filaBanho.isEmpty()) System.out.println("Fila vazia!");
                            //else System.out.println("Atendendo: " + filaBanho.poll());
                        //}
                        //break;

                    //case 0:
                        //System.out.println("Ate logo!");
                        //break;
                    //default:
                        //System.out.println("Opcao invalida!");
                        //break;
                //}
            //} catch (InputMismatchException e) {
                //System.out.println("Digite apenas numeros!");
                //scanner.nextLine();
                //opcao = -1;
            //}
        //}
        //scanner.close();

         //public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //Pet[] arrayPets = new Pet[10];
        //int total = 0;
        //int opcao = -1;

        //while (opcao!= 0) {
            //System.out.println("\n=== PETSHOP ===");
            //System.out.println("1 - Cadastrar pet");
            //System.out.println("2 - Listar pets");
            //System.out.println("0 - Sair");
            //System.out.print("Escolha: ");
            //opcao = scanner.nextInt();
            //scanner.nextLine();

            //switch (opcao) {
                //case 1:
                    //System.out.print("Nome: ");
                    //String nome = scanner.nextLine();
                    //System.out.print("Especie: ");
                    //String especie = scanner.nextLine();
                    //System.out.print("Peso: ");
                    //double peso = scanner.nextDouble();
                    //scanner.nextLine();

                    //Pet pet;
                    //if (especie.equalsIgnoreCase("cachorro")) {
                        //pet = new Cachorro();
                    //} else if (especie.equalsIgnoreCase("gato")) {
                        //pet = new Gato();
                    //} else {
                        //pet = new Pet();
                    //}

                    //pet.nome = nome;
                    //pet.especie = especie;
                    //pet.peso = peso;
                    //pet.porte = pet.definirPorte();

                    //arrayPets[total] = pet;
                    //total++;
                    //System.out.println("Pet cadastrado!");
                    //break;

                //case 2:
                    //for (int i = 0; i < total; i++) {
                        //System.out.println(arrayPets[i]);
                    //}
                    //break;
                //case 0:
                    //System.out.println("Ate logo!");
                    //break;
            //}
        //}
        //scanner.close();

                      //15

            //public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //Pet[] arrayPets = new Pet[10];
        //int total = 0;
        //int opcao = -1;

        //while (opcao!= 0) {
            //System.out.println("\n--- PETSHOP ---");
            //System.out.println("1 - Cadastrar pet");
            //System.out.println("2 - Listar pets");
            //System.out.println("0 - Sair");
            //System.out.print("Escolha: ");
            //opcao = scanner.nextInt();
            //scanner.nextLine();

            //if (opcao == 1) {
                //System.out.print("Nome: ");
                //String nome = scanner.nextLine();
                //System.out.print("Especie: ");
                //String especie = scanner.nextLine();
                //System.out.print("Peso: ");
                //double peso = scanner.nextDouble();
                //scanner.nextLine();

                //Pet pet;
                //if (especie.equalsIgnoreCase("cachorro")) {
                    //pet = new Cachorro();
                //} else if (especie.equalsIgnoreCase("gato")) {
                    //pet = new Gato();
                //} else {
                    //pet = new Pet();
                //}

                //pet.nome = nome;
                //pet.especie = especie;
                //pet.peso = peso;
                //pet.porte = pet.definirPorte();

                //arrayPets[total] = pet;
                //total++;
                //System.out.println("Pet cadastrado!");

            //} else if (opcao == 2) {
                //if (total == 0) {
                    //System.out.println("Nenhum pet cadastrado!");
                //} else {
                    //System.out.println("\n--- PETS CADASTRADOS ---");
                    //for (int i = 0; i < total; i++) {
                        //System.out.println(arrayPets[i]);
                        //arrayPets[i].emitirSom(); // <-- AQUI É O 15
                    //}
               //}
            //}
        //}
        //scanner.close();

        // --- 16 - DOIS MÉTODOS COM MESMO NOME ---

    public static void exibirFicha(Pet pet) {
        System.out.println("Nome: " + pet.nome);
    }

    public static void exibirFicha(Pet pet, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Especie: " + pet.especie);
        System.out.println("Peso: " + pet.peso + " kg");
        System.out.println("Porte: " + pet.porte);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet[] arrayPets = new Pet[10];
        int total = 0;
        int opcao = -1;

        while (opcao!= 0) {
            System.out.println("\n--- PETSHOP ---");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Testar fichas (ex 16)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Especie: ");
                String especie = scanner.nextLine();
                System.out.print("Peso: ");
                double peso = scanner.nextDouble();
                scanner.nextLine();

                Pet pet;
                if (especie.equalsIgnoreCase("cachorro")) pet = new Cachorro();
                else if (especie.equalsIgnoreCase("gato")) pet = new Gato();
                else pet = new Pet();

                pet.nome = nome;
                pet.especie = especie;
                pet.peso = peso;
                pet.porte = pet.definirPorte();
                arrayPets[total] = pet;
                total++;

            } else if (opcao == 2) {
                for (int i = 0; i < total; i++) {
                    System.out.println(arrayPets[i]);
                    arrayPets[i].emitirSom();
                }
            } else if (opcao == 3) {
                if (total > 0) {
                    exibirFicha(arrayPets[0]);
                    System.out.println("---");
                    exibirFicha(arrayPets[0], "=== FICHA DO PET ===");
                }
            }
        }
        scanner.close();
    }
}