package com.mycompany.project.banco;

public class ProjectBank {

    public static void main(String[] args) {
        
        ContaBanco cbJubileu = new ContaBanco();
        cbJubileu.abrirConta("cc");
        cbJubileu.depositar(300.0f);
        cbJubileu.setNumConta(0001);
        cbJubileu.setTitularConta("Jubileu");
        
        cbJubileu.status();
        
        System.out.println("------------------------------");
        
        ContaBanco cbCreuza = new ContaBanco();
        cbCreuza.abrirConta("cp");
        cbCreuza.setTitularConta("Creuza");
        cbCreuza.depositar(500);
        cbCreuza.sacar(650);
        cbCreuza.setNumConta(0002);
        cbCreuza.fecharConta();
        
        cbCreuza.status();
    }
}
