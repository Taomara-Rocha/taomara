package com.example.aula16;

public class TesteSingleton {

    private static TesteSingleton instancia; // Instancia da classe

    private TesteSingleton() { // Construtor privado

    }

    public static TesteSingleton getInstancia() { // Metodo para obter instancia da classe
        if (instancia == null) { // Se instancia for nula (não foi criada) 
            instancia = new TesteSingleton(); // Cria nova instancia da classe
        }           

        return instancia; // Retorna instancia
    }

    public void mostrar() { // Metodo para mostrar a instancia da classe 
        System.out.println("TesteSingleton"); // Imprime a mensagem da classe 
    }   

    public static void main(String[] args) { // Método principal do programa 
        TesteSingleton teste = TesteSingleton.getInstancia(); // Obtém instancia da classe 
        teste.mostrar(); // Mostra a instancia da classe 
    }

}