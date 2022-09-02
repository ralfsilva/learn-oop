package com.mycompany.projetoaluno;

public class Aluno extends Pessoa { // classe utilizando herança para diferença
    
    private int matricula;
    private String curso;
    
    public void pagarMensalidade() {
        System.out.println("Mensalidade paga do aluno " + this.getNome() + ".");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    @Override
    public String toString() {
        return "\nMatricula: " + matricula + "\nCurso: " + curso 
                + "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() 
                + "\nSexo: " + this.getSexo();
    }
    
    
    
}
