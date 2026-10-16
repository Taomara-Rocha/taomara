package com.example.aula14;

public class Gerente extends Funcionario {

    public void aprovarFerias(String quem) {

        System.out.println(nome + " aprovou as ferias para " + quem);
    }

    public void notificar(String quem) {
        System.out.println(nome + " notifica " + quem);
    }

    public void exportar() {
        System.out.println(nome + " exportou");
    }

}
