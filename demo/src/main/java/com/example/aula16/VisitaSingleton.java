package com.example.aula16;

public class VisitaSingleton {

    public static void main(String[] args) {

        ContadorVisita pagina1 = ContadorVisita.getInstancia();
        ContadorVisita pagina2 = ContadorVisita.getInstancia();
        
        pagina1.registrarVisita();
        pagina2.registrarVisita();
        pagina1.registrarVisita(); 

       System.out.println("Total de visitas: " + pagina1.getTotal());
       System.out.println("Total de visitas: " + pagina2.getTotal());
    }
    
}
