package com.example.atividadeInterfaces;

public class Carro implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerado.");
    }

}
