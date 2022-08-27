package com.mycompany.project.banco;

public class ContaBanco {
    
    public int numConta;
    protected String tipoConta;
    private String titularConta;
    private float saldo;
    private boolean status;
    
    public ContaBanco (){
        this.saldo = 0.0f;
        this.status = false;
    }
    
    public int getNumConta (){
        return numConta;
    }
    
    public void setNumConta (int nc){
        this.numConta = nc;
    }
    
    public String getTipoConta (){
        return tipoConta;
    }
    
    public void setTipoConta (String tc){
        this.tipoConta = tc;
    }
    
    public String getTitularConta (){
        return titularConta;
    }
    
    public void setTitularConta (String ttc){
        this.titularConta = ttc;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }
    
    public boolean getStatus (){
        return status;
    }
    
    public void setStatus (boolean st){
        this.status = st;
    }
    
    public void abrirConta (String tc){        
        if (tc.equals("cc")) {
            this.setStatus(true);
            this.setTipoConta("Donta Corrente");
            this.setSaldo(50.0f);
            System.out.println("Conta Corrente aberta.");
        }
        else if (tc.equals("cp")) {
            this.setStatus(true);
            this.setTipoConta("Donta Poupança");
            this.setSaldo(150.0f);
            System.out.println("Conta Poupança aberta.");
        }
        else {
            System.out.println("Digite uma conta válida para ser criada.");
        }
    }
    
    public void fecharConta(){       
        if (this.getSaldo() > 0.0 && this.getStatus() == true){
            System.out.println("A conta não pode ser fechada, ainda possui saldo.");
        } 
        else if (this.getSaldo() < 0.0 && this.getStatus() == true){
            System.out.println("A conta não pode ser fechada, saldo negativo.");
        }
        else if (this.getSaldo() == 0 && this.getStatus() == true) {
            this.setStatus(false);
            System.out.println("A conta foi fechada, volte sempre.");
        }
    }
    
    public void depositar(float d) {
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + d);
            System.out.println("Depósito efetuado com sucesso.");
        }
        else {
            System.out.println("A conta precisa estar criada para depositar.");
        }
    }
    
    public void sacar(float sac) {
        if (this.getStatus() == true && this.getSaldo() >= sac){
            this.setSaldo(this.getSaldo() - sac);
            System.out.println("Saque realizado com sucesso na conta do títular, " + this.getTitularConta() + ".");
        } 
        else if (this.getStatus() == true && sac > this.getSaldo()){
            System.out.println("Não é possível sacar mais do que tem na conta.");
        }
        else {
            System.out.println("Impossibilitado para saque.");
        }
    }
    
    public void pagarMensal() {
        if (this.getTipoConta().equals("cc") && this.getSaldo() >= 12.0){
            this.setSaldo(this.getSaldo() - 12.0f);
        }
        else if (this.getTipoConta().equals("cp") && this.getSaldo() >= 20.0) {
            this.setSaldo(this.getSaldo() - 20.0f);
        }
        else {
            System.out.println("Não é possível realizar o desconto da mensalidade.");
        }
    }
    
    public void status(){
        System.out.println("Status da conta: " + this.getStatus());
        System.out.println("Títular da conta: " + this.getTitularConta());
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipoConta());
        System.out.println("Saldo da conta: R$ " + this.getSaldo());
    }   
}
