package com.mycompany.projetoanimal;

    public class ProjetoAnimal {

    public static void main(String[] args) {
        
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        Canguru c1 = new Canguru();
        Cachorro ca1 = new Cachorro();
        GoldFish gf1 = new GoldFish();
        
        System.out.println("### MAMIFERO ###");
        
        m1.setPeso(32.1f);
        m1.setIdade(5);
        m1.setMembros(4);
        m1.setCorPelo("Marrom");
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();
        System.out.println(m1.toString());
        
        System.out.println("\n" + "### REPTIL ###");
        
        r1.setPeso(12.5f);
        r1.setIdade(3);
        r1.setMembros(4);
        r1.setCorEscama("verde");
        r1.locomover();
        r1.alimentar();
        r1.emitirSom();
        System.out.println(r1.toString());
        
        System.out.println("\n### CANGURU ###");
        c1.locomover();
        
        System.out.println("\n### Cachorro ###");
        ca1.setCorPelo("Preto e marrom");
        ca1.setIdade(3);
        ca1.setMembros(4);
        ca1.setPeso(33.7f);
        System.out.println(ca1.toString());
        ca1.alimentar();
        ca1.emitirSom();
        
        System.out.println("\n### GoldFish ###");
        System.out.println(gf1.toString());
        gf1.alimentar();
        gf1.emitirSom();
        gf1.locomover();
        gf1.soltarBolhas();
    }
}
