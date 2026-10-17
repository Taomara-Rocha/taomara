package com.example.aula16;

public class ContadorVisita {

    private static ContadorVisita instancia;
    private int total = 0;
    private ContadorVisita() {

    }

    public static ContadorVisita getInstancia() {
        if (instancia == null) { 
            instancia = new ContadorVisita(); 
        }           
        return instancia; 
    }

    public void registrarVisita() {
        total++;

    }
    public int getTotal() {
        return total;
        
    }
    
}
