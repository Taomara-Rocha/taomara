package com.example.aula16;


public class CarrinhoSingleton {

    public static void main(String[] args) {

        Carrinho telaProdutos = Carrinho.getInstancia();
        Carrinho telaPromocoes = Carrinho.getInstancia();

        telaProdutos.adicionarItem();
        telaPromocoes.adicionarItem();
        telaProdutos.adicionarItem();
        telaPromocoes.adicionarItem();

        System.out.println("Itens no carrinho: " + telaProdutos.getQuantidadeItens());
        System.out.println("Itens no carrinho: " + telaPromocoes.getQuantidadeItens());
    }

}