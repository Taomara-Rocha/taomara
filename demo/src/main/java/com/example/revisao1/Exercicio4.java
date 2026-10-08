package com.example.revisao1;

// Crie uma classe chamada Pet.
//Dê a ela três atributos: nome (String), raca (String) e peso (double).
//Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
//Atribua valores para os atributos de cada um deles.
//Imprima os dados dos dois pets concatenando textos e variáveis.

public class Exercicio4 {

    public static void main(String[] args) {

        String nomeCachorro = "Amora";
        String racaCachorro = "Spitz";
        double pesoCachorro = 3.5;

        String nomeGato = "Mingau";
        String racaGato = "Persa";
        double pesoGato = 4.2;

        System.out.println("Cachorro: " + nomeCachorro + ", Raça: " + racaCachorro + ", Peso: " + pesoCachorro + " kg");
        System.out.println("Gato: " + nomeGato + ", Raça: " + racaGato + ", Peso: " + pesoGato + " kg");

}
}
