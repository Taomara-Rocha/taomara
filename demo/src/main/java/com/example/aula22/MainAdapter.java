package com.example.aula22;

public class MainAdapter {

 public static void main(String[] args) {

    // Pagamento pagamento = new PayPalAPI(); <- essa linha não compila
        
        PayPalAPI apiExterna = new PayPalAPI();
        Pagamento pagamento = new PayPalAdapter(apiExterna);
        pagamento.pagar();
    }
}


