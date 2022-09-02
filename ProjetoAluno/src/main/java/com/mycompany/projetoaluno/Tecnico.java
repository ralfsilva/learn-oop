package com.mycompany.projetoaluno;

public class Tecnico extends Aluno {

    private boolean registroProfissional;
    
    public void praticar() {
        if (registroProfissional) {
            System.out.println("Registro Profissional ativo.");
        } else {
            System.out.println("Registro Profissional inativo.");
        }
    }

    public boolean isRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(boolean registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    @Override
    public String toString() {
        return "\nMatricula: " + this.getMatricula() + "\nCurso: " + this.getCurso() 
                + "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() 
                + "\nSexo: " + this.getSexo() + "\nRegistro Profissional: " + this.isRegistroProfissional();
    }
    
}
