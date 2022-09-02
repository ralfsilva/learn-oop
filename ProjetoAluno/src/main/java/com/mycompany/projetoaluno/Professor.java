package com.mycompany.projetoaluno;

public class Professor extends Pessoa {
    
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aumento) {
        System.out.println(this.getNome() + " recebeu o aumento de " + aumento);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return "\nnome: " + this.getNome() + "\nidade: " + this.getIdade() + "\nsexo: " + this.getSexo() +
                "\nSalário: " + this.getSalario() + "\nEspecialidade: " + this.getEspecialidade();
    }
    
}
