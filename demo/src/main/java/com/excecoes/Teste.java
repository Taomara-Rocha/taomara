package com.excecoes;

public class Teste {


    public static void main(String[] args) {
        try {

            int resultado = 10/0;
            System.out.println(resultado);

} catch(ArithmeticException ae) {
    System.out.println("Não é possível dividir por zero.");

} finally {
    System.out.println("Isso sempre roda.");
}

System.out.println("O programa continua.");

    }
}

