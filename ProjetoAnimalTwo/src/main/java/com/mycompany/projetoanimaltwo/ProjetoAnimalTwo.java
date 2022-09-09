package com.mycompany.projetoanimaltwo;

public class ProjetoAnimalTwo {

    public static void main(String[] args) {
        // Sobreposicao
        Mamifero m1 = new Mamifero();
        Lobo l1 = new Lobo();
        Cachorro c1 = new Cachorro();
        
        System.out.println("### SOBREPOSIÇÃO ###");
        
        m1.emitirSom();
        l1.emitirSom();
        c1.emitirSom();
        
        // Sobrecarga
        Cachorro c2 = new Cachorro();
        System.out.println("### SOBRECARGA ###");
        c2.reagir("nome");
        c2.reagir("Venha cá pulguento");
        c2.reagir(11, 45);
        c2.reagir(21, 00);
        c2.reagir(true);
        c2.reagir(17, 4.5f);
        
    }
}
