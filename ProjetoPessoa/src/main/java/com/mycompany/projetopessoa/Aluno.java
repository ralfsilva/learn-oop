package com.mycompany.projetopessoa;

public class Aluno extends Pessoa {
    
    private int matr;
    private String curso;
    
    public void cancelarMatric() {
        this.setMatr(getMatr() - 1);
        System.out.println("Possuem " + this.getMatr() + " matriculado(s) no curso " + this.getCurso());
    }
    
    public Aluno() {
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    } 
}
