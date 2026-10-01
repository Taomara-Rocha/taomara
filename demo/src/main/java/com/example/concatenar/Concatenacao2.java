package com.example.concatenar;

//Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a
// quantidade (4). Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0

public class Concatenacao2 {

    public static void main(String[] args) {
        
        String produto = "caneca";
        double valor = 12.50;
        int quantidade = 4;
        double valorTotal = 0;
        valorTotal = quantidade * valor;

        System.out.println("Comprei " + quantidade + " unidades de canecas por R$ " + valor + " cada. Total: R$ " + valorTotal );

    }

}
