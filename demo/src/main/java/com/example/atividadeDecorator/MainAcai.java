package com.example.atividadeDecorator;

public class MainAcai {

    public static void main(String[] args) {

   Acai acaiGranola = new Granola(new AcaiSimples());
        System.out.println(acaiGranola.getDescricao() + " - R$ " + acaiGranola.getPreco());

         Acai acaiCompleto = new Morango(new Granola(new AcaiSimples()));
        System.out.println(acaiCompleto.getDescricao() + " - R$ " + acaiCompleto.getPreco());
}
}