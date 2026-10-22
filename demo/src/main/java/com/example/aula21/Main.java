package com.example.aula21;

import java.util.Scanner;

import com.example.aula21.interfaces.BancoDeDados;
import com.example.aula21.interfaces.MySql;
import com.example.aula21.interfaces.Oracle;

public class Main {

    public static void main(String[] args) {
                     //Explicação
        //MySql mysql = new MySql();
        //BancoDeDados bancoDeDados = new BancoDeDados();
        //MongoDb mongoDb = new MongoDb();
       //BancoDeDados outroBanco = new MongoDb();
                    //Exercício
       //BancoDeDados banco1 = new MySql();
      //BancoDeDados banco2 = new Oracle();

      //conectarBanco(banco1);
      //conectarBanco(banco2);
   //

  //public static void conectarBanco(BancoDeDados banco) {
      //System.out.println(banco.chamarBanco());
      //System.out.println("Número do banco: " + banco.getNumero());
  //}

       //Explicação Factory

       Scanner scanner = new Scanner(System.in);
       System.out.println("Qual o banco deseja utilizar?");
       int opcao = scanner.nextInt();
       
       BancoDeDados banco = new BancoDeDadosFactory().criar(opcao);

       banco.proibidoBarulhoApos22horas();


    }
}
