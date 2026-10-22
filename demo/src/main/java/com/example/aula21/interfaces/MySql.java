package com.example.aula21.interfaces;

public class MySql implements BancoDeDados {

    //String pessoa;
    //int numero;
    //public void proibidoBarulhoApos22horas() {

     @Override
    public String chamarBanco() {
        return "O Banco conectado é o MySql.";
    }

    @Override
    public int getNumero() {
        return 1;

}
}