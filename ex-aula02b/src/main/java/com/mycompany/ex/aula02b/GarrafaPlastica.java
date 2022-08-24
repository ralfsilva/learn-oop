package com.mycompany.ex.aula02b;


public class GarrafaPlastica {
    
    String cor;
    int quantidadeAgua;
    boolean garrafaTampada;
    
    GarrafaPlastica(){
    }
    
    void status(){
        System.out.println("Cor da garrafa: " + this.cor);
        System.out.println("Quantidade de água: " + this.quantidadeAgua + "%");
        System.out.println("Garrafa tampada? " + this.garrafaTampada);
    }
    
    void beberAgua() {
        if (this.garrafaTampada == false){
            System.out.println("\ngarrafa destampada pode beber água.\n");
        } else {
            System.out.println("\ngarrafa tampada não pode beber água.\n");
        }
    }
    
    void abrirGarrafa(){
        this.garrafaTampada = false;
    }
    
    void fecharGarrafa(){
        this.garrafaTampada = true;
    }
    
    void possuiAgua(){
        if (this.quantidadeAgua > 0){
            System.out.println("\ntem água na garrafa.\n");
        } else if (this.quantidadeAgua == 0) {
            System.out.println("\ngarrafa está vazia.\n");
        }
    }
}
