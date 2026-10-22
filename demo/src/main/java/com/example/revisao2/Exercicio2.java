package com.example.revisao2;

public class Exercicio2 {

    public static void main(String[] args) {
        
        int a = 15;
        int b = 4;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));

        int saldo = 1000;
        saldo += 250;
        saldo -= 380;
        System.out.println("Saldo final: " + saldo);


        // 3. a = 10 e b = 10 -> ==, !=, > e >=
        int a2 = 10;
        int b2 = 10;
        System.out.println("a == b: " + (a2 == b2));
        System.out.println("a != b: " + (a2 != b2));
        System.out.println("a > b: " + (a2 > b2));
        System.out.println("a >= b: " + (a2 >= b2));


        // 4. idade = 20 e temCarteira = true -> idade >= 18 && temCarteira
        int idade = 20;
        boolean temCarteira = true;
        System.out.println("Pode dirigir? " + (idade >= 18 && temCarteira));

        // 5. Crie um número e imprima o resto por 2
        int numero = 7;
        System.out.println("Resto de " + numero + " por 2: " + (numero % 2));
       
        // 6. 3 pacotes de arroz a R$ 5.50 cada
        double totalCompra = 3 * 5.50;
        System.out.println("Total da compra: R$ " + totalCompra);

        // 7. MINI-DESAFIO - divisível por 3 e 5 ao mesmo tempo?
        int n = 30; // testa com 15, 30 da true, 10 da false
        boolean divisivel = (n % 3 == 0) && (n % 5 == 0);
        System.out.println("O número " + n + " é divisível por 3 e 5? " + divisivel);
        
    }
}
