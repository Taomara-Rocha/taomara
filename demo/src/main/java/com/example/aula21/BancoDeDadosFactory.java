package com.example.aula21;

import com.example.aula21.interfaces.BancoDeDados;
import com.example.aula21.interfaces.MongoDb;
import com.example.aula21.interfaces.MySql;

public class BancoDeDadosFactory {

    public BancoDeDados criar(int opcao) {

        if (opcao == 1) {
            return new MySql();
        } else if (opcao == 2) {
            return new MongoDb();
        } else {
            throw new IllegalArgumentException("Opção inválida");
        }
    }

}
