package com.mycompany.aula02;


public class Aula02 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.modelo = "esferográfica";
        c1.ponta = 0.5f;
        c1.carga = 60;
        
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.cor = "vermelha";
        c2.modelo = "esferográfica";
        c2.ponta = 0.7f;
        
        c2.tampar();
        c2.status();
        c2.rabiscar();
 
        
    }
}
