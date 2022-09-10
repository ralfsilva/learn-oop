package com.mycompany.projetoanimal;

public class GoldFish extends Peixe {

    private String personalidade;
    private String tempoDeVida;
    
    public GoldFish() {
        this.setCorEscama("Dourado");
        this.setTempoDeVida("10 - 15 anos");
        this.setPersonalidade("Comportamento semelhante aos demais peixes.");
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadar rapidamente.");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Substâncias para peixe.");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("peixe não emite som.");
    }
    
    @Override
    public void soltarBolhas() {
        System.out.println("Blup blup blup.");
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }

    public String getTempoDeVida() {
        return tempoDeVida;
    }

    public void setTempoDeVida(String tempoDeVida) {
        this.tempoDeVida = tempoDeVida;
    }

    @Override
    public String toString() {
        return "\nPersonalidade: " + this.getPersonalidade() + "\nTempoDeVida: " + this.getTempoDeVida() + "\nCor da escama: "
                + this.getCorEscama();
    }
    
    
    
    
}
