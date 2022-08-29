package com.mycompany.livraria;

public class TestLivraria {
    public static void main(String[] args) {
    
        Pessoa pessoa1 = new Pessoa("Ralf", 23, "Masculino");
        pessoa1.fazerAniver();
        Livro livro1 = new Livro("Como Programar Java", "Deitel", 871, pessoa1);
        livro1.detalhes();
        livro1.abrir();
        livro1.folhear();
        livro1.avancarPag(3);
        livro1.voltarPag(5);
    }
}
