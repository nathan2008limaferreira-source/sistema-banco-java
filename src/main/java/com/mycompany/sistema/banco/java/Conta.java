package com.mycompany.sistema.banco.java;

public class Conta {
    private int numero;
    private String titular;
    double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
        else {
            System.out.println("Valor inválido!");
        }
    }
   
    public boolean sacar(double valor) {
       if (valor > 0 && valor <= this.saldo){
           this.saldo -= valor;
           return true;
        }
        else {
         System.out.println("Saldo insuficiente!");
         return false;
        }
    }
        
        public void exibirSaldo(){
            System.out.println("Conta: " + numero + " - " + titular + " | Saldo: R$ " + String.format("%.2f", saldo));
        }

}