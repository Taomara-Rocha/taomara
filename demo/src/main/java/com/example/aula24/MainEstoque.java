package com.example.aula24;

/*) No main, adicione um RegistroEstoque e mude a quantidade duas vezes. */

public class MainEstoque {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        
        RegistroEstoque registro = new RegistroEstoque();
        estoque.adicionarObservador(registro);

        estoque.setQuantidade(100);
        estoque.setQuantidade(50);
    }
}
