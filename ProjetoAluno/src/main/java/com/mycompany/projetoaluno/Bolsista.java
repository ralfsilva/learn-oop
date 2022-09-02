package com.mycompany.projetoaluno;

public class Bolsista extends Aluno {
    
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.printf("Bolsa da %s renovada.",this.getNome());
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " possui desconto de " + this.getBolsa() + "% na mensalidade.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    @Override
    public String toString() {
        return "\nMatricula: " + this.getMatricula() + "\nCurso: " + this.getCurso() +
                "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() 
                + "\nSexo: " + this.getSexo() + "\nBolsa: " + this.getBolsa();
    }
    
    
}
