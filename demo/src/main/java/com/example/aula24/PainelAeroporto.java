package com.example.aula24;

public class PainelAeroporto implements ObservadorVoo {

    @Override
    public void atualizar(String status) {
        System.out.println("Painel aeroporto avisado: " + status);
    }

}
