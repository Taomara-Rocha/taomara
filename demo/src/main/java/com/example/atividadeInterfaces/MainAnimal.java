package com.example.atividadeInterfaces;

import java.util.ArrayList;

public class MainAnimal {

    public static void main(String[] args) {

           Animal bidu = new Cachorro();
           Animal salem= new Gato();

   bidu.emitirSom();
   salem.emitirSom();


   /*Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
   e percorra com for-each chamando emitirSom(). Repare que não
   tem nenhum if. Dica: 

animais.add(new Cachorro()); */

ArrayList<Animal> animais = new ArrayList<>();

animais.add(new Cachorro());
animais.add(new Gato());

for (Animal animal : animais) {
    animal.emitirSom();
}

        
}

}
