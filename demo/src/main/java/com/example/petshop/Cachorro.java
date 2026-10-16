package com.example.petshop;

public class Cachorro extends Pet{

     @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Au au!");
    }

     public void buscarBolinha() {
        System.out.println(nome + " foi buscar a bolinha!");
    }
}

