package com.mycompany.aula03;

public class Aula03 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
         // c1.ponta = 0.7f; - atributo privado não pode ser adicionado um valor desta forma.
        c1.carga = 80;
        // c1.tampada = false;
        c1.destampar();
        c1.rabiscar();         
        c1.status();
        
        
        
    }
}
