package com.example.aula8;


//No main, chame os três e veja o Java escolher sozinho qual usar.
//7 — Crie dois métodos chamados saudacao:
//um sem parâmetro, que imprime "Olá!"
//um que recebe um nome, e imprime "Olá, [nome]!"

public class Metodos {

    public static void main(String[] args) {
      
        Utilidades.mostrarBoasVindas();
        Utilidades.saudar("Taomara");
    
        int numero = 5;
        Utilidades.dobro(numero);

        double n1 = 7.5;
        double n2 = 8.0;
        Utilidades.calcularMedia(n1, n2);

        boolean maiorDeIdade = Utilidades.ehMaiorDeIdade(17);
        if (maiorDeIdade) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }

        
    }   

}
