package com.example.petshop;

public class Banho implements servico {

    @Override
    public void executar(String nomeDoPet) {
        System.out.println("Dando banho em " + nomeDoPet);
    }

}
