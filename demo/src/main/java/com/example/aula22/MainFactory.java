package com.example.aula22;

public class MainFactory {

      public static void main(String[] args) {
        
        Animal a1 = AnimalFactory.getAnimal("Cachorro");
        Animal a2 = AnimalFactory.getAnimal("Gato");
        a1.emitirSom();
        a2.emitirSom();
    }
}

