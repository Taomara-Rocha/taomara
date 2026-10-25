package com.example.atividadeBuilder;

import com.example.atividadesConstrutores.Agendamento;

public class AtividadeBuilder {

    public static void main(String[] args) {

        Agendamento agendamento = new Agendamento.Builder()
                .nomePet("Thor")
                .servico("banho")
                .horario("14:00")
                .perfume(true)
                .laco(true)
                .hidratacao(false)
                .observacao("alérgico a shampoo")
                .desconto(10)
                .build();

        Agendamento agendamento2 = new Agendamento.Builder()
                .nomePet("Luna")
                .servico("tosa")
                .horario("10:00")
                .perfume(false)
                .laco(false)
                .hidratacao(false)
                .observacao("")
                .desconto(0)
                .build();

        Agendamento agendamento3 = new Agendamento.Builder()
                .nomePet("Mel")
                .servico("banho")
                .horario("16:00")
                .perfume(false)
                .laco(false)
                .hidratacao(true)
                .observacao("")
                .desconto(0)
                .build();

        System.out.println(agendamento);
        System.out.println(agendamento2);
        System.out.println(agendamento3);
    }
}
