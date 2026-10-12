package com.example.collecctions;

import java.util.HashMap;

public class ExplicacaoHas {

    public static void main(String[] args) {
        //HashMap é uma coleção que armazena pares de chave e valor.
        //Cada chave é única e está associada a um valor.
        //É útil para armazenar dados que precisam ser acessados rapidamente por uma chave específica.

        //Exemplo de uso do HashMap:
        //Criação de um HashMap para armazenar nomes e emails
        //HashMap<String, String> emails = new HashMap<>();
        //emails.put("Ane", "ane@gmail.com");

    //new.value();
    //putAll(Map.of())

HashMap<String, String> emails = new HashMap<>();

emails.put ("Ane", "ane@gmail.com"); //adiciona a chave "Ane" com o valor "ane@gmail.com"
emails.put ("João", "joao@gmail.com"); //adiciona a chave "João" com o valor "joao@gmail.com"
emails.put ("posição 2", "qualquer coisa"); //adiciona a chave "posição 2" com o valor "qualquer coisa"

System.out.println(emails.get("Ane")); //retorna o valor do email da chave "Ane"
System.out.println(emails.get("João")); //retorna o valor do email da chave "João"
System.out.println(emails.get("posição 2")); //retorna o valor do email da chave "posição 2"

}
}
