package com.example.aula24;

public class DescontoVIP implements Desconto {

     @Override
    public double calcularDesconto(double valor) {
        return valor * 0.20;
    }
}

