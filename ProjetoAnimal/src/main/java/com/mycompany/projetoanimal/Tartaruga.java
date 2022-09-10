package com.mycompany.projetoanimal;

public class Tartaruga extends Reptil {

    @Override
    public void locomover() {
        System.out.println("Caminhando devagar");
    }
    @Override
    public void alimentar() {
        System.out.println("Substâncias marinhas.");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Não emite som");
    }
    
}
