package com.example.atividadeInterfaces;

import java.util.ArrayList;

public class MainVeiculo {

    public static void main(String[] args) {

 ArrayList<Veiculo> veiculos = new ArrayList<>();

 veiculos.add(new Carro());
        veiculos.add(new Moto());

        for (Veiculo v : veiculos) {
            v.ligar();
            v.acelerar();
            System.out.println("---");
        }
    }
}
