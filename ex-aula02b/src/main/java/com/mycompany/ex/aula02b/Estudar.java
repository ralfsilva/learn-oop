package com.mycompany.ex.aula02b;


public class Estudar {
    
    String tema;
    boolean caneta;
    boolean caderno;
    boolean disponivel;
    int diasSemana;
    
    Estudar(){
    }
    
    void status(){
        System.out.println("Tema do estudo: " + this.tema);
        System.out.println("Quantos dias de estudo? " + this.diasSemana);
        System.out.println("Tem caneta? " + this.caneta);
        System.out.println("Tem caderno? " + this.caderno);
        System.out.println("Está disponível? " + this.disponivel);
    }
    
    void temCaneta(){
        if (this.caneta == true){
            System.out.println(" pode escrever, tem caneta ");
        } else {
            System.out.println(" não pode escrever, não tem caneta ");
        }
    }
    
    void temCaderno(){
        if (this.caderno == true){
            System.out.println(" tem caderno ");
        } else {
            System.out.println(" não tem caderno "); 
       }
    }
    
    void estaDisponivel(){
        if (this.disponivel === true){
            System.out.println(" está disponível para estudar ");
        } else {
            System.out.println(" não está disponível para estudar ");
        }
    }
    
    
}
