package com.example.aula24;

import java.util.ArrayList;

public class Voo {

    ArrayList<ObservadorVoo> observadores = new ArrayList<>();
    private String status;

    public void adicionarObservador(ObservadorVoo observador){
        this.observadores.add(observador);
    }

    public void removerObservador(ObservadorVoo observador){
        this.observadores.remove(observador);
    }

     public void mudarStatus(String status){
        this.status = status;
        
        for (ObservadorVoo observador : observadores) {
            observador.atualizar(status);
        }
    }

}
