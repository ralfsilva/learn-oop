package com.mycompany.ex.aula02b;


public class ExAula02b {

    public static void main(String[] args) {
        System.out.println("Exercícios Aula 02b\n");
        
        GarrafaPlastica garrafa1 = new GarrafaPlastica();
        
        garrafa1.cor = "transparente";
        garrafa1.quantidadeAgua = 10;
        garrafa1.fecharGarrafa();
        
        garrafa1.fecharGarrafa();
        garrafa1.beberAgua();
        garrafa1.status();
        
        System.out.println("----------------------------------------");
        
        Livro livro1 = new Livro();
        
        livro1.titulo = "Engenharia de Software";
        livro1.autor = "Márcia Pascutti";
        livro1.capitulos = 5;
        livro1.categoria = "Engenharia de Software";
        livro1.qtdPaginas = 225;
        
        livro1.abrirLivro();
        livro1.lerLivro();
        livro1.status();
        
        System.out.println("----------------------------------");
        
        Estudar estudo1 = new Estudar();
        
        estudo1.caderno = true;
        estudo1.caneta = true;
        estudo1.disponivel = false;
        estudo1.diasSemana = 6;
        estudo1.tema = "Programação orientada a objetos";
        
        System.out.println();
        estudo1.temCaderno();
        estudo1.temCaneta();
        estudo1.status();
        
        
        System.out.println("-------------------------------");
        
        CafeManha cm1 = new CafeManha();
        
        cm1.cafe = true;
        cm1.bananaTerra = true;
        cm1.tapioca = true;
        cm1.ovo = false;
        
        cm1.ststus();
        cm1.comerOvo();
        cm1.beberCafe();
        
        
    }
}
