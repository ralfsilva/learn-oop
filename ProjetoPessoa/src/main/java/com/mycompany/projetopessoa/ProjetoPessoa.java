package com.mycompany.projetopessoa;

public class ProjetoPessoa {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Jussara");
        p2.setNome("Jonas");
        p3.setNome("Claudio");
        p4.setNome("Diego");
        
        p3.setSalario(3241.55f);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        System.out.printf("%nR$ %.2f", p3.getSalario());
        
    }
}
