package com.mycompany.livraria;

import java.util.Random;

public class Livro implements Publicacao {
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public void detalhes() {
        String livro = "";
        if (this.isAberto()){
            livro = "sim.";
        } else {
            livro = "não.";
        }
        
        System.out.println("### LIVRO - " + this.getTitulo() + " ###");
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de Páginas: " + this.getTotPaginas());
        System.out.println("Página Atual: " + this.getPagAtual());
        System.out.println("O livro está aberto? " + livro);
        System.out.println("Leitor: " + this.getLeitor().getNome());
        System.out.println("Idade do leitor: " + this.getLeitor().getIdade());
        System.out.println("Sexo: " + this.getLeitor().getSexo());
    }

    @Override
    public void abrir() {
        if (this.isAberto() == false){
            this.setAberto(true);
            System.out.println("Livro aberto.");
        }
        else if (this.isAberto()){
            System.out.println("O livro já está aberto.");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()){
            this.setAberto(false);
            System.out.println("O livro foi fechado.");
        }
        else if (this.isAberto() == false){
            System.out.println("O livro já está fechado.");
        }
    }

    @Override
    public void folhear() {
        if (this.isAberto()){
            Random pag = new Random();

            int randomPag = pag.nextInt(this.getTotPaginas());
            this.setTotPaginas(randomPag);
            this.setPagAtual(randomPag);
            System.out.println("Página após folhear: " + this.getPagAtual());
        }
        else {
            System.out.println("Não é possível folhear o livro fechado.");
        }
    }

    @Override
    public void avancarPag(int numPag) {
        if (this.isAberto()) {
            this.setPagAtual(this.getPagAtual() + numPag);
            System.out.println("pàgina atual após avançar: " + this.getPagAtual());
        }
        else {
            System.out.println("O livro precisa estar aberto para avançar a(s) página(s).");
        }
    }
    
    @Override
    public void voltarPag(int numPag) {
        if (this.isAberto()) {
            this.setPagAtual(this.getPagAtual() - numPag);
            System.out.println("página atual após retroceder: " + this.getPagAtual());
        }
        else {
            System.out.println("O livro precisa estar aberto para avançar a(s) página(s).");
        }
    }
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
    
}
