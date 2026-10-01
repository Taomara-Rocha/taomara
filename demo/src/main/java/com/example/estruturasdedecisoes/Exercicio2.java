package com.example.estruturasdedecisoes;

// Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente" e quanto está faltando.


public class Exercicio2 {
    
    
    public static void main(String[] args) {

        double saldo = 500.00;
        double valorCompra = 320.00;
        double saldoRestante = saldo - valorCompra;
        double valorFaltando = valorCompra - saldo;
        

        if (saldo >= valorCompra) {
            System.out.println("Compra aprovada! Saldo restante: R$ " + saldoRestante);

        } else {
            System.out.println("Saldo insuficiente. Faltam R$ " + valorFaltando);   
       
        }
         }
          }
 