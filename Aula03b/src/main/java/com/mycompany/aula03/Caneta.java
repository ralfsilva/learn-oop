package com.mycompany.aula03;

import java.time.Clock;


public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    Caneta(){
    }
    
    void status(){
        System.out.println("Esta é a caneta " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    
    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("\nERRO, não posso rabiscar.\n");
        } else {
            System.out.println("\nEstou rabiscando.\n");
        }
    }
    
    void tampar(){
        tampada = true;
    }
    
    void destampar(){
        tampada = false;
    }
    
}
