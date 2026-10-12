package com.example.petshop;

public class Tosa implements servico {

    @Override
    public void executar(String nomeDoPet) {
        System.out.println("Tosando  " + nomeDoPet);
    }

}
