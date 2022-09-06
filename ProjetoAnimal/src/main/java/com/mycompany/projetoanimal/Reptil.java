package com.mycompany.projetoanimal;

public class Reptil extends Animal{
    
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    @Override
    public String toString() {
        return "\nPeso: " + this.getPeso() + "\nIdade: " + this.getIdade() + "\nMembros: " 
                + this.getMembros() + "\nCor Escama: " + this.getCorEscama();
    }
    
    
}
