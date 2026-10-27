package com.example.aula24;

public class Compra {

    private Desconto desconto;

    public Compra(Desconto desconto) {
        this.desconto = desconto;
    }

    public double calcularPrecoFinal(double valor) {
        return valor - desconto.calcularDesconto(valor);
    }
}

