package com.mycompany.projetopessoa;

public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
        System.out.println(this.getNome() + ", hoje é seu aniversário de " + this.getIdade() + " parabéns.");
    }

    public Pessoa() {
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "-------------------------" + "\nnome: " + nome + "\nidade: " + idade + "\nsexo: " + sexo;
    }
    
    
    
}
