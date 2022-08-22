package com.mycompany.aula03;

public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    Caneta(){
    }
    
    public void status(){
        System.out.println("Esta é a caneta " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("\nERRO, não posso rabiscar.\n");
        } else {
            System.out.println("\nEstou rabiscando.\n");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
      
}
