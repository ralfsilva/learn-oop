package com.mycompany.projetovideo;

public class ProjetoVideo {

    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[3];
        Visualizacao vi[] = new Visualizacao[3];
        
        v[0] = new Video("Aula 01 em HTML5");
        v[1] = new Video("Aula 01 POO em PHP");
        v[2] = new Video("Aula 14b POO em Java");
        
        g[0] = new Gafanhoto("gafanhoto1", "Juristeu", 21, "Masculino", 1.3f);
        g[1] = new Gafanhoto("Gafanhoto2", "Jonas", 26, "Masculino", 2.5f);
        g[2] = new Gafanhoto("gafanhota3", "Beatriz", 19, "Feminino", 0.8f);
        
        vi[0] = new Visualizacao(g[0], v[0]); // Juristeu assiste HTML5
        vi[1] = new Visualizacao(g[0], v[1]); // Juristeu assiste PHP
        vi[2] = new Visualizacao(g[0], v[2]); // Juristeu assiste Java
        vi[1] = new Visualizacao(g[0], v[1]); // Juristeu assiste PHP
        vi[0].avaliar(2);
        vi[1].avaliar(2);
        vi[2].avaliar(2);
        
        System.out.println(g[0].toString());
        System.out.println("\n" + v[0].toString());
        System.out.println("\n" + vi[0].toString());
        
    }
}