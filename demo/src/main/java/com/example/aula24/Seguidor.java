package com.example.aula24;

public class Seguidor implements Inscrito {

     String nome;

    public Seguidor(String nome){
        this.nome = nome;
    }

    @Override
    public void receberNotificacao(String mensagem){
        System.out.println(" [" + nome + "] recebeu o alerta: " + mensagem);
    }
}
//Qual problema o padrão Observer resolve? // Observer é um padrão de projeto de software que permite que um objeto seja notificado quando outro objeto muda. Ele é usado para criar uma interface de observação, onde um objeto observador é notificado quando um objeto sujeito é modificado.