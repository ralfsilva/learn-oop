package com.mycompany.ex.aula02b;

public class CafeManha {
    
    boolean cafe;
    boolean tapioca;
    boolean bananaTerra;
    boolean aimpim;
    boolean ovo;
    
    CafeManha(){
    }
    
    void ststus(){
        System.out.println("Vai beber café? " + this.cafe);
        System.out.println("Vai comer tapioca? " + this.tapioca);
        System.out.println("Vai comer banana da terra? " + this.bananaTerra);
        System.out.println("Vai comer aimpim? " + this.aimpim);
        System.out.println("Vai comer ovo? " + this.ovo);
    }
    
    void beberCafe(){
        if (this.cafe == true){
            System.out.println("pode beber café");
        } else {
            System.out.println("não pode beber café");
        }
    }
    
    void comerOvo(){
        if (this.ovo == true){
            System.out.println("pode comer ovo");
        } else {
            System.out.println("não pode comer ovo");
        }
    }
    
}
