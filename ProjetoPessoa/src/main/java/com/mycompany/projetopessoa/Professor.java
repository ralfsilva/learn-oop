package com.mycompany.projetopessoa;

public class Professor extends Pessoa {
    
    private String especialidade;
    private float salario;
    
    public void receberAum(float aumento) {
        float aum = aumento;
        this.setSalario((float) (getSalario() + aumento));
        System.out.println(this.getNome() +  " o seu salário atual é: " + this.getSalario() + ", o anterior era: " + aum);
    }

    public Professor() {
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
