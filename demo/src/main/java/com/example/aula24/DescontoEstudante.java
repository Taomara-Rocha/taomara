package com.example.aula24;

public class DescontoEstudante implements Desconto {

        @Override
    public double calcularDesconto(double valor) {
        return valor * 0.10;

}
}