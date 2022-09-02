package com.mycompany.projetoaluno;

public abstract class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
        System.out.printf("Parabéns, %s, agora você possui %d anos.", this.getNome(), this.getIdade());
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
        return "\nnome: " + nome + "\nidade: " + idade + "\nsexo: " + sexo;
    }
   
    
    
}
