package com.example.aula14;


public class Exercicio6 extends Gerente, pessoa {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.nome = "Joana";
        gerente.baterPonto();
        gerente.aprovarFerias("Marcia");
        gerente.notificar("Mari");
        gerente.exportar();
    }

}
