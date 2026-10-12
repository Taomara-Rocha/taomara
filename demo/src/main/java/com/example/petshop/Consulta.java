package com.example.petshop;

public class Consulta implements servico {

    @Override
    public void executar(String nomeDoPet) {
        System.out.println("Levando " + nomeDoPet + " para consulta");
    }

}
