package com.example.operadoresrelacionais;


public class Relacionais {
public static void main(String[] args) {
    
    int a = 10;
    int b = 3;

    System.out.println("São iguais? " + (a == b));
    System.out.println("São diferentes? " + (a != b));
    System.out.println("A primeira é maior? " + (a > b));
    System.out.println("A primeira é menor? " + (a < b));


   a = 3;
    b = 10;

    System.out.println("São iguais? " + (a == b));
    System.out.println("São diferentes? " + (a != b));
    System.out.println("A primeira é maior? " + (a > b));
    System.out.println("A primeira é menor? " + (a < b));

    a = 5;
    b = 5;

    System.out.println("São iguais? " + (a == b));
    System.out.println("São diferentes? " + (a != b));
    System.out.println("A primeira é maior? " + (a > b));
    System.out.println("A primeira é menor? " + (a < b));

    boolean chovendo = true;
    System.out.println("Não está chovendo? " + !chovendo);
   
}
}
