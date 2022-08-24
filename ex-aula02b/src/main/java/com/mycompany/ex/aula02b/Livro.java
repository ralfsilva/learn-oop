package com.mycompany.ex.aula02b;

public class Livro {
    
    String titulo;
    String categoria;
    int qtdPaginas;
    String autor;
    int capitulos;
    boolean livroAberto;
    
    Livro(){
    }
    
    void status(){
        System.out.println("\nTítulo do livro: " + this.titulo);
        System.out.println("Autor do livro: " + this.autor);
        System.out.println("Categoria do livro: " + this.categoria);
        System.out.println("Quantidade de páginas do livro: " + this.qtdPaginas);
        System.out.println("Nº de Capítulos do Livro: " + this.capitulos + "\n");
    }
    
    void lerLivro(){
        if (this.abrirLivro() == true){
            System.out.println("\npode ler o livro.\n");
        } else {
            System.out.println("\nnão pode ler o livro, está fechado.\n");
        }
    }
    
    boolean abrirLivro(){
        return this.livroAberto = true;
    }
    
    boolean fecharLivro(){
        return this.livroAberto = false;
    }
    
}
