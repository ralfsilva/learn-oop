package com.mycompany.projetoanimal;

public class Canguru extends Mamifero {
    
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
    
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
}
