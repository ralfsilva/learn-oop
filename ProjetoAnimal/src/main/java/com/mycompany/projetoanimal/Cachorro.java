package com.mycompany.projetoanimal;

public class Cachorro extends Mamifero {

    @Override
    public void emitirSom() {
        System.out.println("au au au");
    }
    
    @Override
    public String toString() {
        return "\nPeso: " + this.getPeso() + "\nIdade: " + this.getIdade() + "\nMembros: " 
                + this.getMembros() + "\ncor Pelo: " + this.getCorPelo();
    }
}