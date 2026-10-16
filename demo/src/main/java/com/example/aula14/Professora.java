package com.example.aula14;

/*/* Na Professora, sobrescreva o apresentar() usando @Override, pra
   imprimir "Oi, sou [nome] e ensino [disciplina]." */
public class Professora extends Pessoa {

    String disciplina;

    @Override
    public void apresentar() {
        System.out.printf("Oi, sou %s e ensino %s.\n", nome, disciplina);
    }


    public void lancarNota(String aluna, double nota) {
        System.out.printf("Flora lançou nota %.1f para %s\n", nota, aluna);

    }
    }


