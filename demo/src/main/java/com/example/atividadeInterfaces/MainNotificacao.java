package com.example.atividadeInterfaces;

import java.util.ArrayList;

public class MainNotificacao {

    public static void main(String[] args) {

        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        for (Notificacao n : notificacoes) {
            n.enviar("Sua compra foi aprovada!");
        }
    }
}
