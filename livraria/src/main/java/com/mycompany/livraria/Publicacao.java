package com.mycompany.livraria;

public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear();
    public abstract void avancarPag(int numPag);
    public abstract void voltarPag(int numPag);
}