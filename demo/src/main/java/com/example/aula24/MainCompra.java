package com.example.aula24;

public class MainCompra {
    
        public static void main(String[] args) {

        Compra compra = new Compra(new DescontoEstudante());

        System.out.println(compra.calcularPrecoFinal(100));
        // 90.0
}
}
