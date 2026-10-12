package com.example.petshop;


public class Pet {

    String nome;
    String especie;
    double peso;
    String porte;

String definirPorte() {
        if (peso < 10.00) {
            return "Pequeno";
        } else if (peso >= 10.00 && peso < 25.00) {
            return "Médio";
        } else {
            return "Grande";
        }
    }

    public void emitirSom() {
        System.out.println(nome + " Emite som...");
    }

    @Override
    public String toString() {
        return nome + " (" + especie + ") - " + peso + " kg - Porte " + porte;
    }
}

