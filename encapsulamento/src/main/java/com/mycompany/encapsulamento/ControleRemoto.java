package com.mycompany.encapsulamento;

public class ControleRemoto implements Controlador {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;        
    }
    
    private int getVolume() {
        return volume;
    }
    
    private void setVolume(int volume) {
        this.volume = volume;
    }
    
    private boolean getLigado() {
        return ligado;
    }
    
    private void setLigado(boolean ligado) {
        this.ligado = ligado; 
    }
    
    private boolean getTocando() {
        return tocando;
    }
    
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    
    @Override
    public void ligar(){
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------- MENU ---------");
        System.out.println("Está ligada? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        if (this.getVolume() > 100 && this.getVolume() == 100){
            System.out.println("Volume máximo: " + this.getVolume());
        } 
        else if (this.getVolume() < 0){
            System.out.println("Volume mínimo: " + this.getVolume());
        }
        else {
            System.out.println("Volume: " + this.getVolume());
        }
        
        for (int i = 1; i <= this.getVolume(); i++){
            if (this.getVolume() >= 0 && this.getVolume() <= 100){
                System.out.print("|");
            }
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechsndo Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() && this.getVolume() <= 100 || this.getVolume() > 0) {
            this.setVolume(this.getVolume() + 5);
        } 
        else if (this.getLigado() && this.getVolume() == 100){
            System.out.println("Volume máximo: " + this.getVolume());
        }
        else if (this.getLigado() && this.getVolume() > 100){
            System.out.println("Não é possível aumentar o volume mais do que isso: " + this.getVolume());
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } 
        else {
            System.out.println("Não é possível diminuir o volume, a tv está desligada.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(20);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
            System.out.println("Tocando.");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
            System.out.println("Pausado.");
        }
    }
}
