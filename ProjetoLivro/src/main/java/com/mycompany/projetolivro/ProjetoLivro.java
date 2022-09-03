package com.mycompany.projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Ralf", 23, "Masculino");
        p[1] = new Pessoa("João", 32, "Masculino");
        
        l[0] = new Livro("Como Programar Java", "Deitel", 856, p[0]);
        l[1] = new Livro("Cristianismo Puro e Simples", "CS Lewis", 213, p[0]);
        
        System.out.println(l[1].detalhes());
    }
}
