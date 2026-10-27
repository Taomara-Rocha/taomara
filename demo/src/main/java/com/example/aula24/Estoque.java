package com.example.aula24;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

 private int quantidade;
    private List<ObservadorEstoque> observadores;

    public Estoque() {
        observadores = new ArrayList<>();
    }

    public void adicionarObservador(ObservadorEstoque observador) {
        observadores.add(observador);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (ObservadorEstoque observador : observadores) {
            observador.atualizar(quantidade);
        }
    }
}

