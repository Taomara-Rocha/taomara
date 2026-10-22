package com.example.atividadesConstrutores;

public class MainPet {

public static void main(String[] args) {

    //Agendamento agendamento = new Agendamento("Thor", "banho", "14:00", true, true, false,"alérgico a shampoo", 10);
    //Agendamento agendamento2 = new Agendamento("Luna", "tosa", "10:00", false, false, false,"", 0);
    //Agendamento agendamento3 = new Agendamento("Mel", "banho", "16:00", false, false, true, "", 0);

        //System.out.println(agendamento.nomePet);
        //System.out.println(agendamento.servico);
        //System.out.println(agendamento.horario);
        //System.out.println(agendamento.perfume);
        //System.out.println(agendamento.laco);
        //System.out.println(agendamento.hidratacao);
        //System.out.println(agendamento.observacao);
        //System.out.println(agendamento.desconto);

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