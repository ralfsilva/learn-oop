package com.mycompany.projetopessoa;

public class Funcionario extends Pessoa {
    
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho() {
        this.isTrabalhando(!this.trabalhando);
    }

    public Funcionario() {
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }
    
    public void isTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}